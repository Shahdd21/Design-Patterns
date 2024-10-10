package structural.adapter.adapter_exercise;

public class MainService {
    private final ThirdPartyReportService reportService;

    public MainService(ThirdPartyReportService reportService) {
        this.reportService = reportService;
    }

    public String getReport(){
        return reportService.getReport();
    }
}
