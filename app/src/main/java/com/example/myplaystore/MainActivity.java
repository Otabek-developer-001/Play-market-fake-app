package com.example.myplaystore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Intent;
import android.os.Bundle;

import com.example.myplaystore.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ChildAdapter adapter1 , adapter2 , adapter3 , adapter4 , adapter5;
    private List<ChildModels> childModelsList1 , childModelsList2 , childModelsList3 , childModelsList4 , childModelsList5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadData();

        adapter1 = new ChildAdapter(childModelsList1, getBaseContext(), childModels -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("image",childModelsList1.getClass());
            intent.putExtra("name",childModelsList1.getClass());
            intent.putExtra("amount",childModelsList1.getClass());
            startActivity(intent);
        });
        adapter2 = new ChildAdapter(childModelsList2, getBaseContext(), childModels -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("image",childModelsList2.getClass());
            intent.putExtra("name",childModelsList2.getClass());
            intent.putExtra("amount",childModelsList2.getClass());
            startActivity(intent);
        });
        adapter3 = new ChildAdapter(childModelsList3, getBaseContext(), childModels -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("image",childModelsList3.getClass());
            intent.putExtra("name",childModelsList3.getClass());
            intent.putExtra("amount",childModelsList3.getClass());
            startActivity(intent);
        });
        adapter4 = new ChildAdapter(childModelsList4, getBaseContext(), childModels -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("image",childModelsList4.getClass());
            intent.putExtra("name",childModelsList4.getClass());
            intent.putExtra("amount",childModelsList4.getClass());
            startActivity(intent);
        });
        adapter5 = new ChildAdapter(childModelsList5, getBaseContext(), childModels -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("image",childModelsList5.getClass());
            intent.putExtra("name",childModelsList5.getClass());
            intent.putExtra("amount",childModelsList5.getClass());
            startActivity(intent);
        });

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager5 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        binding.recycle1.setLayoutManager(layoutManager1);
        binding.recycle2.setLayoutManager(layoutManager2);
        binding.recycle3.setLayoutManager(layoutManager3);
        binding.recycle4.setLayoutManager(layoutManager4);
        binding.recycle5.setLayoutManager(layoutManager5);

        binding.recycle1.setAdapter(adapter1);
        binding.recycle2.setAdapter(adapter2);
        binding.recycle3.setAdapter(adapter3);
        binding.recycle4.setAdapter(adapter4);
        binding.recycle5.setAdapter(adapter5);
    }
    private void loadData() {
        childModelsList1 = new ArrayList<>();
        childModelsList1.add(new ChildModels(R.drawable.spotify,"Spotify","30 MB"));
        childModelsList1.add(new ChildModels(R.drawable.musicapp,"AIMP","5.1 MB"));
        childModelsList1.add(new ChildModels(R.drawable.music,"Apple Music","39 MB"));
        childModelsList1.add(new ChildModels(R.drawable.shazam,"Shazam","7.1 MB"));
        childModelsList1.add(new ChildModels(R.drawable.yandexmusic,"Yandex Music","15 MB"));
        childModelsList1.add(new ChildModels(R.drawable.beelinemusic,"Beeline Music","13 MB"));
        childModelsList1.add(new ChildModels(R.drawable.youtube_music,"YouTube Music","18 MB"));

        childModelsList2 = new ArrayList<>();
        childModelsList2.add(new ChildModels(R.drawable.tiktok,"Tik-Tok","66 MB"));
        childModelsList2.add(new ChildModels(R.drawable.instagram,"Instagram","36 MB"));
        childModelsList2.add(new ChildModels(R.drawable.twitter,"Twitter","29MB"));
        childModelsList2.add(new ChildModels(R.drawable.facebook,"Facebook","57 MB"));
        childModelsList2.add(new ChildModels(R.drawable.messenger,"Messenger","42 MB"));
        childModelsList2.add(new ChildModels(R.drawable.odnoklassniki,"OK","51 MB"));
        childModelsList2.add(new ChildModels(R.drawable.reddit,"Reddit","47 MB"));
        childModelsList2.add(new ChildModels(R.drawable.telegram,"Telegram","25 MB"));
        childModelsList2.add(new ChildModels(R.drawable.vk,"Vk","72 MB"));

        childModelsList3 = new ArrayList<>();
        childModelsList3.add(new ChildModels(R.drawable.bbc_news,"BBC News","20 MB"));
        childModelsList3.add(new ChildModels(R.drawable.kun,"Kun.uz","13 MB"));
        childModelsList3.add(new ChildModels(R.drawable.the_new_york_times,"The New York Times","19 MB"));
        childModelsList3.add(new ChildModels(R.drawable.flipboard,"Flipboard","14 MB"));
        childModelsList3.add(new ChildModels(R.drawable.daryo,"Daryo.uz","13 MB"));
        childModelsList3.add(new ChildModels(R.drawable.channels,"4PDA","2.6 MB"));
        childModelsList3.add(new ChildModels(R.drawable.euro_news,"Euronews","6.7 MB"));

        childModelsList4 = new ArrayList<>();
        childModelsList4.add(new ChildModels(R.drawable.olx,"OLX","19 MB"));
        childModelsList4.add(new ChildModels(R.drawable.zood_mall,"ZoodMall","10 MB"));
        childModelsList4.add(new ChildModels(R.drawable.alibaba,"Alibaba.com","85 MB"));
        childModelsList4.add(new ChildModels(R.drawable.aliexpress,"Aliexpress","43 MB"));
        childModelsList4.add(new ChildModels(R.drawable.avito,"Авито","59 MB"));
        childModelsList4.add(new ChildModels(R.drawable.korzinka,"Korzinka.uz","11 MB"));
        childModelsList4.add(new ChildModels(R.drawable.makroapp,"Makro Application","53 MB"));
        childModelsList4.add(new ChildModels(R.drawable.olcha,"Olcha.uz","7.2 MB"));
        childModelsList4.add(new ChildModels(R.drawable.lebazar,"Lebazar","9.5 MB"));

        childModelsList5 = new ArrayList<>();
        childModelsList5.add(new ChildModels(R.drawable.sberbank,"Сбербанк","83 MB"));
        childModelsList5.add(new ChildModels(R.drawable.kiwi,"QIWI","27 MB"));
        childModelsList5.add(new ChildModels(R.drawable.binance,"Binance","74 MB"));
        childModelsList5.add(new ChildModels(R.drawable.click,"Click","24 MB"));
        childModelsList5.add(new ChildModels(R.drawable.payme,"PayMe","10 MB"));
        childModelsList5.add(new ChildModels(R.drawable.payeer,"PAYEER","19 MB"));
        childModelsList5.add(new ChildModels(R.drawable.apelsin,"Apelsin","26 MB"));
        childModelsList5.add(new ChildModels(R.drawable.paynet,"Paynet","19 MB"));
        childModelsList5.add(new ChildModels(R.drawable.oson,"Oson","18 MB"));
    }
}