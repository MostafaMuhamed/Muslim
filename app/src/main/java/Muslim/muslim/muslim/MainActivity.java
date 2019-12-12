package Muslim.muslim.muslim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Muslim.muslim.muslim.Model.UserModel;

import com.example.muslim.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private ArrayList<UserModel> userModels;
    private getAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialViews();
        initialList();
    }


    private void initialViews()
    {
        recyclerView = findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        userModels = new ArrayList<>();
    }

    private void initialList()
    {
        userModels.add(new UserModel(" الله"," هو الاسم الأعظم لذات الله تعالى، وهو جامع لكل أسمائه."));
        userModels.add(new UserModel(" الرحمن"," واسع الرحمة في خلقه، مؤمنهم وكافرهم، في معاشهم ومعادهم."));
        userModels.add(new UserModel(" الرحيم"," المعطي من الثواب أضعاف العمل"));
        userModels.add(new UserModel(" الملك"," المتصرف في ملكه كما يشاء."));
        userModels.add(new UserModel(" القدوس"," المنزه عن كل وصف يدركه حس أو خيال"));
        userModels.add(new UserModel(" السلام"," السالم من العيوب والنقائص، النار سلامته على خلقه."));
        userModels.add(new UserModel(" المؤمن"," المصدق نفسه وكتبه ورسله فيما يقولونه عنه."));
        userModels.add(new UserModel(" المهيمن"," المسيطر على كل شيء بكمال قدرته."));
        userModels.add(new UserModel(" العزيز"," الغالب الذي لا نظير له."));
        userModels.add(new UserModel(" الجبار"," المنفذ مشيئته على سبيل الإجبار والجبر."));
        userModels.add(new UserModel(" المتكبر"," المتفرد بصفات العظمة والكبرياء، المتكبر عن النقص والحاجة."));
        userModels.add(new UserModel("الخالق"," المبدع خلقه بإرادته."));
        userModels.add(new UserModel("البارئ"," المميز لخلقه بالصور المختلفة."));
        userModels.add(new UserModel(" المصور"," الذي أعطى لكل خلق صورة خاصة."));
        userModels.add(new UserModel(" الغفار"," الذي يستر القبيح في الدنيا ويتجاوز عنه في الآخرة."));
        userModels.add(new UserModel(" القهار"," الذي يقهر الجبابرة."));
        userModels.add(new UserModel(" الوهاب"," المتفضل بالعطايا."));
        userModels.add(new UserModel(" الرزاق"," خالق الأرزاق، والمتكفل بإيصالها إلى خلقه."));
        userModels.add(new UserModel(" الفتاح"," الذي يفتح خزائن رحمته لعباده."));
        userModels.add(new UserModel(" العليم"," المحيط علمه بكل شيء."));
        userModels.add(new UserModel(" القابض"," قابض يده عمن يشاء من عباده حسب إرادته."));
        userModels.add(new UserModel(" الباسط"," بأسراره على من يشاء."));
        userModels.add(new UserModel(" الخافض"," الذي يخفض الكفار والأشقياء."));
        userModels.add(new UserModel(" الرافع"," للأقدار بين أولياء الرجال."));
        userModels.add(new UserModel(" المعز"," للمؤمنين بطاعته."));
        userModels.add(new UserModel(" المذل"," للكافرين بعصيانهم."));
        userModels.add(new UserModel(" السميع"," الذي لا يغيب عنه مسموع."));
        userModels.add(new UserModel(" البصير"," الذي يشاهد جميع الموجودات."));
        userModels.add(new UserModel(" الحكم"," الذي إليه ترجع الأمور والأحكام."));
        userModels.add(new UserModel(" العدل"," الذي ليس في ملكه خلل."));
        userModels.add(new UserModel(" اللطيف"," البر بعباده."));
        userModels.add(new UserModel(" الخبير"," العالم بكل شيء، ظاهر وباطن."));
        userModels.add(new UserModel(" الحليم"," الذي لا يعجل بالانتقام."));
        userModels.add(new UserModel(" العظيم"," الذي لا تصل العقول إلى كنه ذاته."));
        userModels.add(new UserModel(" الغفور"," غافر الذنب وقابل التوب."));
        userModels.add(new UserModel(" الشكور"," المنعم على عباده بالثواب."));
        userModels.add(new UserModel(" العلي"," الذي علا بذاته وصفاته عن مدارج الخلق."));
        userModels.add(new UserModel(" الكبير"," المنزه عن الأوهام."));
        userModels.add(new UserModel(" الحفيظ"," حافظ الكون من الخلل."));
        userModels.add(new UserModel(" المقيت"," خالق الأقوات ومقسمها."));
        userModels.add(new UserModel(" الحسيب"," الذي يكفى عباده حاجتهم."));
        userModels.add(new UserModel(" الجليل"," عظيم القدر بجلاله وكماله."));
        userModels.add(new UserModel(" الكريم"," عطاؤه لا ينفد."));
        userModels.add(new UserModel(" الرقيب"," الملاحظ لما يرعاه."));
        userModels.add(new UserModel(" المجيب"," الذي يجيب الداعي إذا دعاه."));
        userModels.add(new UserModel(" الواسع"," الذي وسع كرسيه السماوات والأرض."));
        userModels.add(new UserModel(" الحكيم"," المنزه عن فعل ما لا ينبغي بجلاله وكماله."));
        userModels.add(new UserModel(" الودود"," المتحبب إلى خلقه."));
        userModels.add(new UserModel(" المجيد"," الشريف في ذاته و أفعاله، الجزيل عطاؤه ونواله."));
        userModels.add(new UserModel(" الباعث"," باعث الموتى للحساب."));
        userModels.add(new UserModel(" الشهيد"," العالم بالأمور الظاهرة والباطنة."));
        userModels.add(new UserModel(" الحق"," خالق كل شيء بحكمة."));
        userModels.add(new UserModel(" الوكيل"," الموكول  إليه الأمور والمصالح."));
        userModels.add(new UserModel(" القوي"," الذي با يُعجزه شيء."));
        userModels.add(new UserModel(" المتين"," الذي لا يُغلب."));
        userModels.add(new UserModel(" الولي"," المحب لأوليائه، الناصر لهم، والموالي لهم."));
        userModels.add(new UserModel(" الحميد"," المستحق للحمد والثناء."));
        userModels.add(new UserModel(" المحصي"," الذي لا يفوته دقيق الأمور، ولا يعجزه دليلها."));
        userModels.add(new UserModel(" المبدئ"," الذي بدأ الخلق، وأوجده من العدم."));
        userModels.add(new UserModel(" المعيد"," الذي يعيد الخلق إلى الموت."));
        userModels.add(new UserModel(" المحيي"," الذي يحيي العظام وهي رميم."));
        userModels.add(new UserModel(" المميت"," الذي يميت الأجسام بنزع الأرواح منها."));
        userModels.add(new UserModel(" الحي"," المتصف بالحياة الأبدية."));
        userModels.add(new UserModel(" القيوم"," القائم على كل شيء."));
        userModels.add(new UserModel(" الواجد"," الذي يجد كل ما يطلبه ويريده."));
        userModels.add(new UserModel(" الماجد"," كبير الإحسان والأفضال."));
        userModels.add(new UserModel(" الواحد"," المتفرد ذاتًا ووصفًا وأفعالًا."));
        userModels.add(new UserModel(" الصمد"," المقصود بالحوائج."));
        userModels.add(new UserModel(" القادر"," المتفرد باختراع الموجودات."));
        userModels.add(new UserModel(" المقتدر"," الذي يقدر على ما يشاء."));
        userModels.add(new UserModel(" المقدم"," مقدم الأنبياء والأولياء ومن يشاء."));
        userModels.add(new UserModel("المؤخر"," مؤخر الأعداء بالإبعاد."));
        userModels.add(new UserModel(" الأول"," السابق للأشياء."));
        userModels.add(new UserModel(" الاخر"," الباقي بعد فناء خلقه."));
        userModels.add(new UserModel(" الظاهر"," بآياته وعلامات قدرته."));
        userModels.add(new UserModel(" الباطن"," المحتجب عن الأنظار، المطلع على الأسرار."));
        userModels.add(new UserModel(" الوالي"," المالك للأشياء، والمتصرف فيها كما يشاء، والمنعم بالعطاء، والدافع للبلاء."));
        userModels.add(new UserModel(" المتعال"," رفيع الدرجات ذو العرش، المرتفع في كبريائه وعظمته."));
        userModels.add(new UserModel(" البر"," الذي يمن على السائلين بحسن عطائه."));
        userModels.add(new UserModel(" التواب"," يقبل التوبة من عباده، ويعفو عن السيئات."));
        userModels.add(new UserModel(" المنتقم"," الذي نخشى نقمته لقدرته وعظمته، وهو الذي نجو منه الرحمة خوفًا وطمعًا."));
        userModels.add(new UserModel(" العفو"," الذي يمحو الذنوب ويتجاوز عن السيئات."));
        userModels.add(new UserModel(" الرؤوف"," شديد الرحمة بعباده."));
        userModels.add(new UserModel(" مالك الملك"," له التصرف المطلق، ومالك الملك الذي ينفذ مشيئته في ملكه كيف يشاء ومتى يشاء لا مرد لقضائه، ولامعقب لحكمه."));
        userModels.add(new UserModel(" ذو الجلال والاكرام"," الذي لا جلال ولا كمال ولا شرف إلا هو له، فالجلال في ذاته، والكرامة على خلقه."));
        userModels.add(new UserModel(" المقسط"," القائم بالقسط والمقيم للعدل."));
        userModels.add(new UserModel(" الجامع"," الذي جمع الكمالات كلها ذاتًا ووصفًا وفعلًا."));
        userModels.add(new UserModel(" الغني"," الذي لايحتاج إلى شيء في ذاته، ولا في صفاته، ولا في أفعاله."));
        userModels.add(new UserModel(" المغني"," المعطي من يشاء من عباده."));
        userModels.add(new UserModel(" المانع"," الذي يمنع البلاء حفظًا وعناية، ويمنع العطاء عمن يشاء ابتلاءً أو حماية."));
        userModels.add(new UserModel(" الضار"," يصيب من يشاء من عباده، فهو مالط الضر."));
        userModels.add(new UserModel(" النافع"," هو مالك النفع، وهو على كل شيء قدير."));
        userModels.add(new UserModel(" النور"," الذي نور قلوب الصادقين بتوحيده."));
        userModels.add(new UserModel(" الهادي"," الذي أعطى كل شيء خلقه ثم هدى."));
        userModels.add(new UserModel(" البديع"," الخالق البديع في ذاته."));
        userModels.add(new UserModel(" الباقي"," الدائم الوجود الوصوف بالبقاء، بقاء الأبد والأزل."));
        userModels.add(new UserModel(" الوارث"," من له ما في السماوات وما في الأرض، رب كل شيء ووارثه ورازقه وراحمه."));
        userModels.add(new UserModel(" الرشيد"," المرشد لأهل الطاعة."));
        userModels.add(new UserModel(" الصبور"," الذي يملي ويمهل، وينظر ولا يعجل، ولا يعاجل ولا يسارع على الفعل قبل أوانه، وينزل الأمر بقدر معلوم."));

        adapter = new getAdapter(userModels);
        recyclerView.setAdapter(adapter);



    }

    private class getAdapter extends RecyclerView.Adapter<getAdapter.getViewHolder>
    {
        ArrayList<UserModel> userModels;

        public getAdapter(ArrayList<UserModel> userModels)
        {
            this.userModels = userModels;
        }

        @NonNull
        @Override
        public getAdapter.getViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item,parent,false);
            return new getViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull getAdapter.getViewHolder holder, int position)
        {
           UserModel model = userModels.get(position);
           holder.text_name.setText(model.getText_name());
           holder.text_tafser.setText(model.getText_tafser());
        }

        @Override
        public int getItemCount()
        {
            return userModels.size();
        }

        private class getViewHolder extends RecyclerView.ViewHolder
        {
            TextView text_name,text_tafser;
            public getViewHolder(@NonNull View itemView)
            {
                super(itemView);
                text_name = itemView.findViewById(R.id.txt_name);
                text_tafser = itemView.findViewById(R.id.txt_tafser);
            }
        }
    }
}
