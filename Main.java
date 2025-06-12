enum TaskStatus{
    In_Progress, Failed, Pending_Review, Completed;
}
public class Main {
    public static void main(String[] args) {
        TaskStatus currentStatus = TaskStatus.In_Progress;
        System.out.println("current status index : " + currentStatus.ordinal());
        
        TaskStatus[] allStatus = TaskStatus.values();
        System.out.println("First defined status : " + allStatus[0]);
        
        for(TaskStatus status : allStatus){
            System.out.println(status + "(indext:" + status.ordinal() + ")");
        }
    }
    
}
