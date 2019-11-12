package Test;

import GroupMoviePhotoScene.GeneratePhotoElement.AbstractFactory.FrozenPhotoFactory;
import GroupMoviePhotoScene.GeneratePhotoElement.AbstractFactory.MickeyPhotoFactory;
import GroupMoviePhotoScene.GeneratePhotoElement.MovieScene;

public class AbstractFactoryPatternTest {
    public static void AbstractFactoryPatternTest()
    {
        FrozenPhotoFactory fac1=new FrozenPhotoFactory();
        MovieScene moviescene = fac1.createScene("aaa","bbb");
        MickeyPhotoFactory fac2 = new MickeyPhotoFactory();
        MovieScene moviescene2 = fac2.createScene("MickeyMouse","ccc");
        MovieScene moviescene3 = fac2.createScene("DonaldDuck","dddd");
    }
}
