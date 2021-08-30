package dd.wan.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val controller: NavController = navHostFragment.navController

//        bottomNavigationView.setupWithNavController(controller)


        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.fragmentA -> {
                    controller.navigate(R.id.fragmentA)
                }
                R.id.fragmentB -> {
                    controller.navigate(R.id.fragmentB)
                }
                R.id.fragmentC -> {
                    controller.navigate(R.id.fragmentC)
                }
            }
            true
        }
//        bottomNavigationView.setOnNavigationItemSelectedListener {
//
//        }

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationIcon(R.drawable.ic_baseline_menu_24)
        toolbar.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        navigationView.setupWithNavController(controller)
    }
}

