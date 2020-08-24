/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author hatai
 */
public class MyFacade {
    private static MyFacade MyFacadeObj = null;
        private MyFacade() {}
        public static MyFacade getMyFacadeObject() {
            if(MyFacadeObj == null) {
                MyFacadeObj = new MyFacade();
            }
            return MyFacadeObj;
        }
        public void MySchedule() {
            ScheduleServer scheduleServer = new ScheduleServer();
            scheduleServer.startBooting();
            scheduleServer.readSystemConfigFile();
            scheduleServer.init();
            scheduleServer.initializeContext();
            scheduleServer.initializeListeners();
            scheduleServer.createSystemObjects();
            System.out.println("Start working......");
            System.out.println("After work done.........");
            scheduleServer.releaseProcesses();
            scheduleServer.destory();
            scheduleServer.destroySystemObjects();
            scheduleServer.destoryListeners();
            scheduleServer.destoryContext();
            scheduleServer.shutdown();
        }
}
