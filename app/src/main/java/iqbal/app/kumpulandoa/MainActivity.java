package iqbal.app.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import iqbal.app.kumpulandoa.adapter.ContainerAdapter;
import iqbal.app.kumpulandoa.fragment.DoaFragment;
import iqbal.app.kumpulandoa.fragment.HomeFragment;
import iqbal.app.kumpulandoa.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager fpMain;
    private Button btnHome, btnDoa, btnProfile;
    private ContainerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting object (view)
        fpMain = (ViewPager) findViewById(R.id.view_pager_main);
        btnHome = (Button) findViewById(R.id.btn_home);
        btnDoa = (Button) findViewById(R.id.btn_doa);
        btnProfile = (Button) findViewById(R.id.btn_profile);

        setContainerPrepared(); //method untuk preparing fragment container
        onButtonClicked(); //method untuk click button nanti
    }

    private void setContainerPrepared() {
        adapter = new ContainerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), getString(R.string.menu_home));
        adapter.addFragment(new DoaFragment(), getString(R.string.menu_doa));
        adapter.addFragment(new ProfileFragment(), getString(R.string.menu_profile));
        fpMain.setAdapter(adapter);

    }

    private void onButtonClicked() {
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fpMain.setCurrentItem(0);
            }
        });

        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fpMain.setCurrentItem(1);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fpMain.setCurrentItem(2);
            }
        });
    }
}
