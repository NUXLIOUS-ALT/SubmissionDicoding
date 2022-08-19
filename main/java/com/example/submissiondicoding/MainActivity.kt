package com.example.submissiondicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBijuu: RecyclerView
    private var list: ArrayList<Bijuu> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBijuu = findViewById(R.id.rv_bijuu)
        rvBijuu.setHasFixedSize(true)

        list.addAll(BijuuData.listData)
        rvBijuu.layoutManager = LinearLayoutManager(this)
        val listBijuuAdapter = ListBijuuAdapter(list, this)
        rvBijuu.adapter = listBijuuAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val about = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(about)
            }
        }
    }
}
