package com.androidapk.diakonetapps.psycho_notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.util.ArrayList;

public class ReadActivity extends AppCompatActivity {

    PDFView view;
    int position;
    int minPage, maxPage;
    ArrayList<Integer> allpages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

//        if (getIntent().getExtras() != null){
//            position = getIntent().getExtras().getInt("position");
//
//            switch (position){
//                case 0:
//                    minPage = 0;
//                    maxPage = 1;
//                    break;
//
//                case 1:
//                    minPage = 2;
//                    maxPage = 2;
//                    break;
//
//                case 2:
//                    minPage = 3;
//                    maxPage = 5;
//                    break;
//
//                case 3:
//                    minPage = 6;
//                    maxPage = 6;
//                    break;
//
//                case 4:
//                    minPage = 7;
//                    maxPage = 18;
//                    break;
//
//                case 5:
//                    minPage = 19;
//                    maxPage = 39;
//                    break;
//
//                case 6:
//                    minPage = 40;
//                    maxPage = 64;
//                    break;
//
//                case 7:
//                    minPage = 65;
//                    maxPage = 83;
//                    break;
//
//            }
//        }
//
//        int[] alPages = new int[maxPage - minPage];
//
//        for (int i = minPage; i <= maxPage; i++){
//            for (int a = 0; a < 1; a++){
//                alPages[a] = i;
//            }
//
//        }

        view = findViewById(R.id.view_pdf);

//        String filename = "psychology.pdf";
        String filename = "pro.pdf";

        view.fromAsset(filename)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .enableAnnotationRendering(false)
                .enableAntialiasing(true)
                .spacing(0)
                .pageFitPolicy(FitPolicy.BOTH)
                .pageSnap(true)
                .pageFling(false)
                .load();

    }
}
