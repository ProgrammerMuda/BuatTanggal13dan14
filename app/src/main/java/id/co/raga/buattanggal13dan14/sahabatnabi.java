package id.co.raga.buattanggal13dan14;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class sahabatnabi extends AppCompatActivity {

    String[] namasahabat = {
            "Abu Bakar ash shiddiq",
            "Ali bin Abi Talib",
            "Khalid bin Walid",
            "Umar bin Khattab",
            "Mua'dz bin Jabal",
            "Usman bin Affan",
            "Bilal bin Rabah",
            "Abu Dzar Al-Ghiffari",
            "Thalhah bin Ubaidillah",
            "Hamzah bin Abdul Muthalib",
            "Amr bin ash",
            "Zubair bin awwam",
            "Abdullah bin mas'ud",
            "Abu sufyan bin harits",
            "Abbas bin abdul muthalib",

    };

    Integer[] gambarsahabat = {
            R.drawable.th,
            R.drawable.ali,
            R.drawable.khalid,
            R.drawable.umar,
            R.drawable.muadzbinjabal,
            R.drawable.usman,
            R.drawable.bilal,
            R.drawable.abudzar,
            R.drawable.thlahah,
            R.drawable.hamzah,
            R.drawable.amr,
            R.drawable.zubair,
            R.drawable.masud,
            R.drawable.abusufyan,
            R.drawable.abas,

    };

    String[] subtitle = {
            "(al-Shiddiq atau jujur dan membenarkan)",
            "(gerbang ilmu)",
            "(Saifullah Al Maslul atau Pedang Allah yang Terhunus).",
            "(Al FAruq atau Sang Pembeda)",
            "(Cendekiawan muslim yang paling tahu mana yang haram dan yang halal)",
            "(Dzun Nurain atau dua cahaya)",
            "(Muadzin Rasulullah)",
            "(Pelayan Duafa dan Pelurus Penguasa)",
            "(Pahlawan Perang uhud)",
            "(Singa Allah dan panglima syuhada)",
            "(Pembebas Mesir)",
            "(Pembela Rasulullah)",
            "(Peti Rahasia Rasul atau Shahibus Sirri Rasulullah)",
            "(Ketua Pemuda Surga)",
            "(pengurus air minum mekkah dan madinah)",

    };

    String[] url = {
            "https://islamislami.com/2017/04/23/biografi-lengkap-dan-kisah-inspiratif-abu-bakar-ash-shiddiq-sang-khulafaur-rasyidin/",
            "https://suaramuslim.net/biografi-ali-bin-abi-thalib/",
            "https://edywitanto.wordpress.com/2010/11/29/khalid-ibnul-walid/",
            "https://mahluktermulia.wordpress.com/2010/04/17/umar-bin-khattab/",
            "https://edywitanto.wordpress.com/2010/11/08/mu%E2%80%99adz-bin-jabal/",
            "http://kisahmuslim.com/4066-keutamaan-utsman-bin-affan.html",
            "https://edywitanto.wordpress.com/2010/11/06/bilal-bin-rabah/#more-1427",
            "https://edywitanto.wordpress.com/2010/11/06/abu-dzar-al-ghifari/#more-1422",
            "https://edywitanto.wordpress.com/2010/12/02/thalhah-bin-ubaidillah/",
            "https://edywitanto.wordpress.com/2010/11/08/hamzah-bin-abdul-mutthalib/",
            "http://kisahmuslim.com/4270-biografi-amr-bin-al-ash.html",
            "https://edywitanto.wordpress.com/2010/12/02/zubair-bin-awwam/",
            "https://buletinmitsal.wordpress.com/sosok/abdullah-bin-mas%E2%80%99ud/",
            "https://edywitanto.wordpress.com/2010/12/09/abu-sufyan-bin-harits/",
            "https://edywitanto.wordpress.com/2010/12/09/abbas-bin-abdul-muthalib/",

    };

    ListView list;
    AlertDialog.Builder alert1;
    AlertDialog alert2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahabatnabi);

        CustomListAdapter cladapter = new CustomListAdapter(this, namasahabat, subtitle, gambarsahabat);
        list = (ListView)findViewById(R.id.list1);
        list.setAdapter(cladapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int position , long l) {
                alert1 = new AlertDialog.Builder(sahabatnabi.this);
                alert1
                        .setTitle(namasahabat[position])
                        .setMessage("Sahabat yang anda pilih adalah " + namasahabat[position])
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String title = namasahabat[position];
                                Integer gambar = gambarsahabat[position];
                                String subtitle1 = subtitle[position];
                                String url1 = url[position];

                                Bundle ngambil = new Bundle();

                                ngambil.putString("judul",title);
                                ngambil.putString("subjudul",subtitle1);
                                ngambil.putInt("gambar",gambar);
                                ngambil.putString("url", url1);

                                Intent kirim = new Intent(sahabatnabi.this,detail.class);
                                kirim.putExtras(ngambil);
                                startActivity(kirim);

                            }
                        })
                        .setNegativeButton("Kembali", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });

                alert2= alert1.create();
                alert2.show();


            }
        });
    }
}
