package lambda;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class demo4 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //创建Text对象
        Text text = new Text();

        //将字体设置为文本
        text.setFont(new Font(45));

        //设置文本的位置
        text.setX(50);
        text.setY(150);

        //设置要添加的文本
        text.setText("Welcome to nanjing!");

        //创建组对象
        Group root = new Group();

        //检索可观察列表对象
        ObservableList list = root.getChildren();

        //将文本对象设置为组对象的节点
        list.add(text);

        //创建场景对象
        Scene scene = new Scene(root, 600, 300);

        //设置舞台的标题
        stage.setTitle("JAVAFX");

        //将场景添加到舞台
        stage.setScene(scene);

        //显示舞台的内容
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }

}
