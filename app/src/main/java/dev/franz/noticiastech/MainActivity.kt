package dev.franz.noticiastech

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var infoTechAdapter: infoTechAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()

    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.infoTechAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {

        this.infoTechAdapter = infoTechAdapter { infoTech ->

            openLink(infoTech.link)

        }

        recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerview.adapter = this.infoTechAdapter

    }

    private fun openLink(url : String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}