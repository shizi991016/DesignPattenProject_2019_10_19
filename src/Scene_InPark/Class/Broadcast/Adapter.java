package Scene_InPark.Class.Broadcast;

//该适配器更改广播播放闭园语言

import java.util.Scanner;

public class Adapter {

    //要切换成的语言,默认为中文
    private int language = 1;
    //选择需要的语言翻译
    public Adapter() {
        System.out.print("Adapter:Adapter:请选择您需要切换的语言：1、中文，2、English，3、Deutsch\n" + //中文
                "Please select the language you need to switch：1、中文，2、English，3、Deutsch\n" +//英文
                "Bitte wählen Sie die gewünschte Sprache aus：1、中文，2、English，3、Deutsch");//德文

        Scanner sc = new Scanner(System.in);
        language = sc.nextInt();

    }

    //将原本的闭园语音转换为切换后的语音
    public String translate() {

        String message = "广播：游园即将关闭，请各位游客尽快出园.";

        if (language == 1) {
            message = "广播：游园即将关闭，请各位游客尽快出园.";
        }
        else if (language == 2) {
            message = "Broadcast：The park will be closed soon. Please leave as soon as possible.";
        }
        else if (language == 3) {
            message = "Radio übertragen:Der Park wird bald geschlossen. Bitte gehen Sie so schnell wie möglich.";
        }
        else {
            System.out.println("Adapter:translate:数字输入错误，请重新输入");
        }
        //返回切换好的语音
        return message;
    }
}
