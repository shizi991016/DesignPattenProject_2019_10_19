package GroupMoviePhotoScene;

import GroupMoviePhotoScene.GeneratePhotoElement.*;
import GroupMoviePhotoScene.GeneratePhotoElement.ArPhotoRoom.*;
import GroupMoviePhotoScene.GeneratePhotoElement.Photo.*;
import GroupMoviePhotoScene.GeneratePhotoElement.PhotoUser.User;

public class StatePatternTest {
    public static void StatePatternTest(){
        ProxyPhotoRoom room = new ProxyPhotoRoom();
        User user = new User();
        user.request(room);
        System.out.println("当前User的状态时" + user.getCur_state().getStateName());
        user.request(room);
        System.out.println("当前User的状态时" + user.getCur_state().getStateName());
        user.request(room);
        System.out.println("当前User的状态时" + user.getCur_state().getStateName());
        user.request(room);
        System.out.println("当前User的状态时" + user.getCur_state().getStateName());
    }
}
