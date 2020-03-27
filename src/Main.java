import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        System.out.println("Production test release...");
        System.out.println("Production prodA release...");

        List<DemoDM> demoDMList = new ArrayList<>();
        demoDMList = getDemoList();
        if(demoDMList!=null && demoDMList.size() > 0){
            for (int i = 0; i < demoDMList.size() ; i++) {
                System.out.println("Command : "+demoDMList.get(i).getCommand() + " - Desc : "+demoDMList.get(i).getCommandDesc());
            }
        }

        System.out.println("PRINTING STATEMENT ADDED SUCCESSFULLY")

    }

    public static List<DemoDM> getDemoList(){
        List<DemoDM> demoList = new ArrayList<>();

        DemoDM demoDM = new DemoDM();
        demoDM.setVersionController("Git");
        demoDM.setCommand("git init");
        demoDM.setCommandDesc("Initializes empty git repository");
        demoList.add(demoDM);

        demoDM = new DemoDM();
        demoDM.setVersionController("Git");
        demoDM.setCommand("git clone");
        demoDM.setCommandDesc("Clones a project from the url");
        demoList.add(demoDM);

        demoDM = new DemoDM();
        demoDM.setVersionController("Git");
        demoDM.setCommand("git status");
        demoDM.setCommandDesc("Checks any files that are in the working directory that are yet to staged/committed");
        demoList.add(demoDM);

        demoDM = new DemoDM();
        demoDM.setVersionController("Git");
        demoDM.setCommand("git log");
        demoDM.setCommandDesc("Produces a data of all commits with date,SHA Id,commit Message");
        demoList.add(demoDM);
        demoDM = new DemoDM();
        demoDM.setVersionController("Git");
        demoDM.setCommand("git add");
        demoDM.setCommandDesc("Move the files from working directory to staging index");
        demoList.add(demoDM);

        demoDM = new DemoDM();
        demoDM.setVersionController("Git");
        demoDM.setCommand("git commit");
        demoDM.setCommandDesc("Move the files from staging index to repository");
        demoList.add(demoDM);



        return demoList;
    }

}
