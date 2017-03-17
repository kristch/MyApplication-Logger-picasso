package com.android.tedcoder.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import es.dmoral.toasty.Toasty;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;
/**
 * 代码补全 ctr+shift +enter
 * 删除行 ctr+y
 * 上下移动行：alt+shift +上下左右
 *
 * 切换视图 上下左右 alt+上下左右
 * 复制当前航 ctr+d
 * 正则表达式： alt+enter
 * 打开设置   ctr+alt +s
 * 格式化代码：ctr +alt +l
 * 提取方法 ctl+alt + M
 * 提取参数 ctl +atl +p
 * 提取变量 ctrl +alt +v 例如写了一个new student()；前面会自动生成并且可以使用shift+tab 进行选择
 * 合并文本 两行辩称干一行显示 ctr+shift +j
 * 动态模板 ctr+j
 *  * 后缀补全
 * 列表对象.for
 * 重命名： shift+f6
 * 分析某一个变量怎么传递:右键这个变量-angle-analyze data flow to here
 *当别人争在测试拿来一个bug:可以直接关联程序 右键-build- attach to android process
 *调式：
 * 条件断点：
 * 右键填写表达式 然后输入布尔表达式
 * 禁用断点：alt+点击断点
 * 计算表达式：处在断点状态下然后按住alt+f8 就可以显示表达式对话框
 * 审查变量：调试状态下 按住alt键点击表达式就可以
 * 终止进程： ctrl+f2
 * 调用层级树窗口：ctrl+alt+h
 *
 * 弹窗：
 * 切换器： ctrl+tab
 * 版本控制弹窗：alt +'
 *
 *与分之对比：
 * menu-vcs-git-compare with branch
 *
 * 文件结构弹窗：ctr+f12
 * 返回编辑器：esc 或者shift+esc
 * 相关文件切换：ctl+alt+home
 * 最近文件：ctrl+e
 * 查找类名：ctr+n
 * 快速查看定义：ctr+shift+i
 * 定位到父类;选中然后ctr+u
 * 根据编号打开面板：alt+数字
 * 回到上一个工具窗口：f12
 * 回到上一个编辑位置：ctr+shift+backspace
 * 高亮显示：菜单-edit-find-highlight usages in file
 * 隐藏所有面板：ctr +shifit+f12
 * 查找补全：ctr+f
 * 添加标签：快速移动到那个位置 ctr+数字　需要提前设置ｃｔｒ＋ｆ１１
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class MainActivity extends AppCompatActivity {
    private TextView tv1, tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Picasso.with(this).load(R.drawable.test).transform(new CropCircleTransformation()).into((ImageView) findViewById(R.id.testimage));
        initView();
        test();
        test2();
        Toasty.error(this,"这是个错误").show();
        Toasty.info(this, "Hello World").show();
       // Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
        //第三方框架使用
    }
    /**
     * 包裹代码
     * ctr+alt+t
     */

    public void doStudeff(){
        if (true) {
            String s = "hhh"; //在这里点击快捷键就可以了
        }
    }
    /**
     * 代码补全
     */
    private boolean buquan(){
        String s = "hell0";
        return s.isEmpty();
    }
    /**
     * 后缀补全
     * 列表对象.for
     */
    private void houzhui(){
        ArrayList<Object> arrayList = new ArrayList<>();
        for (Object o : arrayList) {

        }
    }
    /**
     *动态末班
     * ctr+j
     */
    private void test(){
        for (int i=0;i<10;i++) {
            String ss = "" + i;
        }
        String ss = "hje";
        if (ss == null) {

        }
       String sss = "hello";
        if (sss == null) {

        }
    }
    private  void test2(){
        int sum=0;
        for (int j=0;j<100;j++) {
            sum+=j;
            Log.d("hello","www");
        }
    }
    /**
     * 合并行和文本
     */
    private void method(){
        int i=0; //在这个地方操作ctr+shift+j就可以看到效果
        // 定义一个变量
    }

    /**
     * 初始化方法
     */
    private void initView() {

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
    }

    private  void sayHello() {
        sayHello("say");
    }

    private  void sayHello(String s) {
        sayHello(s, "hello");
    }

    private  void sayHello(String s, String h){
        Log.d("",s +""+ h);
    }

    /**
     * 正则匹配
     * @param s
     * @return
     */
    private boolean matchers(String s) {
        return s.matches("\\d.\\-.*");
    }
    /**
     * 提取变量
     */
    private void getExtractVariable(){
        ArrayList<Object> list = new ArrayList<>();
    }



}
