package structural.adapter.adapter_exercise;

public class DashboardService implements DashboardAdapter{

    private final MainService mainService;

    public DashboardService(MainService mainService) {
        this.mainService = mainService;
    }

    public String getReport(){
        String csvReport = mainService.getReport();

        return convertIntoJSON(csvReport);
    }

    private String convertIntoJSON(String csvReport){
        return "Report is now in JSON format";
    }
}
