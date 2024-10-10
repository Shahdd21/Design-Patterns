package structural.adapter;

import structural.adapter.adapter_exercise.DashboardAdapter;
import structural.adapter.adapter_exercise.DashboardService;
import structural.adapter.adapter_exercise.MainService;
import structural.adapter.adapter_exercise.ThirdPartyReportService;

public class Main {

    public static void main(String[] args){
        ThirdPartyReportService reportService = new ThirdPartyReportService();

        MainService mainService = new MainService(reportService);

        DashboardAdapter dashboardAdapter = new DashboardService(mainService);

        System.out.println(dashboardAdapter.getReport());
    }
}
