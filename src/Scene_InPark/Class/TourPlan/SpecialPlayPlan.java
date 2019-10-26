package Scene_InPark.Class.TourPlan;

import Scene_InPark.Class.TourPlan.GenratePlayPlan;

public abstract class SpecialPlayPlan extends GenratePlayPlan {
    private String morningPlan;
    //重写父类GeneratePlayPlan中的morningPlan()方法
    @Override
    protected void morningPlan() {
        System.out.print(morningPlan + "  ");
    }
    //提供给用户设置上午计划的接口
    public void setMorningPlan(String morningPlan) {
        this.morningPlan = morningPlan;
    }
}