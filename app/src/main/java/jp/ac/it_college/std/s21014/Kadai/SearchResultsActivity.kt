package jp.ac.it_college.std.s21014.Kadai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import jp.ac.it_college.std.s21014.Kadai.databinding.ActivitySearchResultsBinding

class SearchResultsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = listOf(
            "緑ヶ丘公園",
            "泉崎公園",
            "美栄橋公園",
            "泉公園",
            "久米公園",
            "東町北公園",
            "阿手川公園",
            "東町南公園",
            "城岳公園",
            "松山公園",
            "福州園",
            "松尾公園",
            "久茂地公園",
            "壺川東公園",
            "若松公園",
            "壺川中公園",
            "西公園",
            "中央公園",
            "辻南公園",
            "辻公園",
            "奥武山公園",
            "希望ヶ丘公園",
            "前島中公園",
            "旭ヶ丘公園",
            "船増原公園",
            "前島北公園",
            "三文殊公園",
            "三文珠公園",
            "牧志北公園",
            "夫婦瀬公園",
        )

        val adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, data
        )
        binding.list2.adapter = adapter

        binding.list2.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this, SearchResults2Activity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
    }
}