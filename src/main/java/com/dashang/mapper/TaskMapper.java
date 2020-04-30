package com.dashang.mapper;

import com.dashang.Message.Mesg;
import com.dashang.entity.TakeTask;
import com.dashang.entity.Task;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface TaskMapper {
    //搜索所有订单
    @Select("select t.*, p.PRODUCT_NAME from task t join product p on t.PRODUCT_ID = p.PRODUCT_ID")
    List<Task> getAll();

    //向任务表插入 新任务
    @Insert("insert into task values(null,#{taskState},#{productId},#{nums},null,null)")
    @Options(useGeneratedKeys=true, keyProperty="taskId", keyColumn="TASK_ID")
    void add(Task task);

    //指定接受任务的厂家
    @Update("update task set TASK_STATE = 1, PRICE = #{price}, USER_ID = #{userId} where TASK_ID =  #{taskId}")
    void setFirm(TakeTask takeTask);

    //拒绝厂家
    @Update("update task set TASK_STATE = 0, PRICE = null, USER_ID = null where TASK_ID =  #{numMesg}")
    void refuseFirm(Mesg mesg);

    //判断本任务是不是未接单
    @Select("select * from task where TASK_ID = #{taskId} and TASK_STATE = 0")
    List<Task> getThis0(TakeTask takeTask);

    //判断本任务是不是已接单
    @Select("select * from task where TASK_ID = #{numMesg} and TASK_STATE = 1")
    List<Task> getThis1(Mesg mesg);

    @Delete("delete from task where TASK_ID = #{numMesg}")
    void delTask(Mesg mesg);
}
