package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import au.edu.anu.cecs.innerintel.R;
import au.edu.anu.cecs.innerintel.activity.HomepageActivity;

public class ProfileActivity extends AppCompatActivity {


    ImageView userImage;
    Uri imageUri;
    Button getStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initView();

        userImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upLoad();
            }
        });

        getStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Start managing your health",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), HomepageActivity.class);
                startActivity(i);
            }
        });

    }


    private void initView(){
        getStartButton = findViewById(R.id.getStartButton);
        userImage = findViewById(R.id.userImage);
    }


    /**
     * Opens the photo album  when the user clicks on the picture.
     */
    private void upLoad() {

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
        startActivityForResult(intent, 10);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == RESULT_OK) {
            userImage.setImageURI(data.getData());
            imageUri = data.getData();
        }
    }

}