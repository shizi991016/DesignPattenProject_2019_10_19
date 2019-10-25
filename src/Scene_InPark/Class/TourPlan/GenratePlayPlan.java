package Sence_InPark.Class.TourPlan;

public abstract class GenratePlayPlan {
    //迪士尼一日游计划模板，输出一日游中所有的活动；
    public void agendaForTheDay(){
        System.out.println("迪士尼今日计划：");
        goIn();
        morningPlan();
        lunch();
        afternoonPlan();
        goOut();
        dinner();
        getAccommodation();
    }
    //进园，输出进园信息
    protected void goIn(){
        System.out.print("进入迪士尼  ");
    }
    //上午游玩计划，输出上午游玩项目
    abstract protected void morningPlan();
    //中饭，输出中饭信息
    protected void lunch(){
        System.out.print("吃午饭  ");
    }
    //下午游园计划，输出下午游玩项目
    abstract protected void afternoonPlan();
    //出园，输出出园信息
    protected void goOut(){
        System.out.print("出门离去  ");
    }
    //晚饭，输出晚饭信息
    protected void dinner(){
        System.out.print("吃晚饭  ");
    }
    //住宿，输出住宿信息
    protected void getAccommodation(){
        System.out.println("去住宿");
    }
}

