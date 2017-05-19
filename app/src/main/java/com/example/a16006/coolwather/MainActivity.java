package com.example.a16006.coolwather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> data=new ArrayList<String>(Arrays.asList("浙江","福建","河北","河南","云南","辽宁","湖南","安徽","山东","江苏","江西","湖北","甘肃","山西","陕西","吉林","贵州","广东","青海","西藏","四川","海南"));
    private List<String> data1=new ArrayList<String>(Arrays.asList("温州","台州","杭州","宁波","绍兴","嘉兴","湖州","金华","衢州","舟山","丽水"));
    private List<String> data2=new ArrayList<String>(Arrays.asList("福州市","泉州市","漳州市","南平市","三明市","龙岩市","莆田市","宁德市"));
    private List<String> data3=new ArrayList<String>(Arrays.asList("石家庄","秦皇岛","唐山","保定","张家口","廊坊","沧州","衡水","承德","邢台","邢台"));
    private List<String> data4=new ArrayList<String>(Arrays.asList("郑州","封","洛阳","洛阳","安阳","鹤壁","新乡","焦作","濮阳","许昌","漯河","三门峡","南阳","商丘","信阳","周口","驻马","济源"));
    private List<String> data5=new ArrayList<String>(Arrays.asList("合肥","芜湖","蚌埠","淮南","马鞍山","淮北","铜陵","安庆","黄山","阜阳","宿州","滁州","六安","宣城","巢湖","池州","亳州"));
    private List<String> data6=new ArrayList<String>(Arrays.asList("济南","青岛","淄博","枣庄","东营","烟台","潍坊","济宁","泰安","威海","日照","莱芜","临沂","德州","聊城","滨州","菏泽"));
    private List<String> data7=new ArrayList<String>(Arrays.asList("南京","无锡","徐州","常州","苏州","南通","连云港","淮安","盐城","扬州","镇江","泰州","宿迁"));
    private List<String> data8=new ArrayList<String>(Arrays.asList("南昌","九江","赣州","上饶","宜春","景德镇","抚州","吉安","新余","鹰潭","萍乡"));
    private List<String> data9=new ArrayList<String>(Arrays.asList("武汉","黄石","襄樊","十堰","孝感","荆州","荆门","咸宁","宜昌","襄樊","鄂州","黄冈"));
    private List<String> data10=new ArrayList<String>(Arrays.asList("天水","白银","平凉","庆阳","陇南","定西","金昌","武威","张掖","酒泉","嘉峪关"));
    private List<String> data11=new ArrayList<String>(Arrays.asList("太原","大同","阳泉","长治","晋城","朔州","晋中","运城","忻州","临汾","吕梁"));
    private List<String> data12=new ArrayList<String>(Arrays.asList("西安","宝鸡","渭南","咸阳","铜川","延安","商洛","汉中","榆林","安康"));
    private List<String> data13=new ArrayList<String>(Arrays.asList("长春","吉林","四平","辽源","通化","白山","松原","白城"));
    private List<String> data14=new ArrayList<String>(Arrays.asList("贵阳","遵义","六盘水","安顺","清镇","铜仁","毕节","兴义","都匀","凯里","仁怀","赤水"));
    private List<String> data15=new ArrayList<String>(Arrays.asList("广州","深圳","珠海","汕头","韶关","佛山","江门","湛江","茂名","肇庆","惠州","梅州","汕尾","河源","阳江","清远","东莞","中山","潮州","揭阳","云浮"));
    private List<String> data16=new ArrayList<String>(Arrays.asList("格尔木","西宁","玉树","果洛","海东","海西","海南","海北"));
    private List<String> data17=new ArrayList<String>(Arrays.asList("拉萨","日喀则"));
    private List<String> data18=new ArrayList<String>(Arrays.asList("成都","自贡","攀枝花","泸州","德阳","绵阳","广元","遂宁","内江","乐山","南充","眉山","宜宾","广安","达州","雅安","巴中","资阳"));
    private List<String> data19=new ArrayList<String>(Arrays.asList("海口","文昌","三亚",",五指山","琼海","儋州","万宁"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {
                    case 0:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 1:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 2:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 3:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 4:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 5:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 6:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 7:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 8:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 9:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 10:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 11:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 12:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 13:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 14:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 15:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 16:
                        adapter.clear();
                        adapter.addAll(data2);
                        adapter.notifyDataSetChanged();break;
                    case 17:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                    case 18:
                        adapter.clear();
                        adapter.addAll(data1);
                        adapter.notifyDataSetChanged();break;
                }
            }
        });
        
    }
}
