package hothientam.mssv16110451.mediaplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTotalTime, txtCurrentTime, txtSongName, txtSingerName;
    ImageView imgSong;
    ImageButton btnReplay, btnPrev, btnNext, btnPlay, btnShuffle;
    SeekBar sbSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();
    }

    private void mapping() {
        txtCurrentTime = findViewById(R.id.txtThoiGianHienTai);
        txtTotalTime = findViewById(R.id.txtTongThoiGian);
        txtSingerName = findViewById(R.id.txtTenCaSi);
        txtSongName = findViewById(R.id.txtTenBaiHat);
        imgSong = findViewById(R.id.imgAnhBaiHat);
        btnPlay = findViewById(R.id.btnPlay);
        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrevious);
        btnReplay = findViewById(R.id.btnLapLai);
        btnShuffle = findViewById(R.id.btnNgauNhien);
        sbSong = findViewById(R.id.sbBaiHat);
    }
}
