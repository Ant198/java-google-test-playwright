package Actions;

public class Actions {
    private static ResultPageActions resultPageActionsActions;


        public static ResultPageActions resultPageActions() {
            if (resultPageActionsActions == null) {
                resultPageActionsActions = new ResultPageActions();
            }
            return resultPageActionsActions;
        }
}
