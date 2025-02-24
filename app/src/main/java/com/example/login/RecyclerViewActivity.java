package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list with data
        siswaList = new ArrayList<>();
//        siswaList.add(new Siswa("Nendra", "Absen 1", "Kelas 10 PPLG 1", "Nendra is an enthusiastic student who loves participating in class discussions."));
//        siswaList.add(new Siswa("Dikky", "Absen 2", "Kelas 10 PPLG 1", "Dikky is known for his problem-solving skills and often helps his peers."));
//        siswaList.add(new Siswa("Alfian", "Absen 3", "Kelas 10 PPLG 1", "Alfian is always eager to learn new things and enjoys reading books in his free time."));
//        siswaList.add(new Siswa("Almira", "Absen 4", "Kelas 10 PPLG 1", "Almira is a hardworking student with a great passion for science and technology."));
//        siswaList.add(new Siswa("Arza", "Absen 5", "Kelas 10 PPLG 1", "Arza loves sports and is always participating in physical activities during school breaks."));
//        siswaList.add(new Siswa("Azka", "Absen 6", "Kelas 10 PPLG 1", "Azka is a quiet yet thoughtful student who enjoys working on creative projects."));
//        siswaList.add(new Siswa("Bayu", "Absen 7", "Kelas 10 PPLG 1", "Bayu has a great sense of humor and is always making his classmates laugh."));
//        siswaList.add(new Siswa("Raya", "Absen 8", "Kelas 10 PPLG 1", "Raya is a dedicated student who excels in mathematics and loves challenges."));
//        siswaList.add(new Siswa("Daffa", "Absen 9", "Kelas 10 PPLG 1", "Daffa is a team player who enjoys group work and is very friendly with everyone."));
//        siswaList.add(new Siswa("Dhiaz", "Absen 10", "Kelas 10 PPLG 1", "Dhiaz has a talent for art and often brings his creative ideas to class."));
//        siswaList.add(new Siswa("Dira", "Absen 11", "Kelas 10 PPLG 1", "Dira is an active participant in class debates and loves discussing current events."));
//        siswaList.add(new Siswa("Enriko", "Absen 12", "Kelas 10 PPLG 1", "Enriko is a quiet but attentive student, always paying close attention in class."));
//        siswaList.add(new Siswa("Fabian", "Absen 13", "Kelas 10 PPLG 1", "Fabian is always on top of his assignments and loves learning new technologies."));
//        siswaList.add(new Siswa("Galih", "Absen 14", "Kelas 10 PPLG 1", "Galih enjoys playing the guitar and often performs for his classmates."));
//        siswaList.add(new Siswa("Gerrard", "Absen 15", "Kelas 10 PPLG 1", "Gerrard is an avid gamer and always shares his knowledge with friends."));
//        siswaList.add(new Siswa("Gian", "Absen 16", "Kelas 10 PPLG 1", "Gian is passionate about coding and enjoys creating apps in his free time."));
//        siswaList.add(new Siswa("Ihsan", "Absen 17", "Kelas 10 PPLG 1", "Ihsan is very helpful and loves assisting others with their work."));
//        siswaList.add(new Siswa("Madi", "Absen 18", "Kelas 10 PPLG 1", "Madi enjoys sports, especially basketball, and is always practicing after school."));
//        siswaList.add(new Siswa("Keiko", "Absen 19", "Kelas 10 PPLG 1", "Keiko is a language enthusiast who enjoys learning new languages in her spare time."));
//        siswaList.add(new Siswa("Ugi", "Absen 20", "Kelas 10 PPLG 1", "Ugi is passionate about history and often shares interesting facts with the class."));
//        siswaList.add(new Siswa("El", "Absen 21", "Kelas 10 PPLG 1", "El has a creative mind and loves designing websites during free periods."));
//        siswaList.add(new Siswa("Febrian", "Absen 22", "Kelas 10 PPLG 1", "Febrian is a quiet student but excels in written work and enjoys literature."));
//        siswaList.add(new Siswa("Firdaus", "Absen 23", "Kelas 10 PPLG 1", "Firdaus loves volunteering for school activities and is always eager to help."));
//        siswaList.add(new Siswa("Yazid", "Absen 24", "Kelas 10 PPLG 1", "Yazid enjoys playing video games and is often the top scorer in class tournaments."));
//        siswaList.add(new Siswa("Zanadin", "Absen 25", "Kelas 10 PPLG 1", "Zanadin is an excellent communicator and often leads group discussions."));
//        siswaList.add(new Siswa("Zayyan", "Absen 26", "Kelas 10 PPLG 1", "Zayyan is a creative artist who loves drawing and often shares his artwork with the class."));
//        siswaList.add(new Siswa("Osmar", "Absen 27", "Kelas 10 PPLG 1", "Osmar is an aspiring writer and enjoys writing short stories during free time."));
//        siswaList.add(new Siswa("Ozora", "Absen 28", "Kelas 10 PPLG 1", "Ozora is very passionate about photography and loves capturing beautiful moments."));
//        siswaList.add(new Siswa("Adika", "Absen 29", "Kelas 10 PPLG 1", "Adika is a natural leader who often organizes group activities and helps classmates."));
//        siswaList.add(new Siswa("Rafan", "Absen 30", "Kelas 10 PPLG 1", "Rafan is a very motivated student who sets high goals for himself and works hard to achieve them."));
//        siswaList.add(new Siswa("Ghasia", "Absen 31", "Kelas 10 PPLG 1", "Ghasia is an empathetic student who is always looking out for others in the class."));
//        siswaList.add(new Siswa("Rakha", "Absen 32", "Kelas 10 PPLG 1", "Rakha loves playing chess and often challenges classmates to games during break."));
//        siswaList.add(new Siswa("Arfa", "Absen 33", "Kelas 10 PPLG 1", "Arfa is an excellent researcher who enjoys diving deep into new subjects."));
//        siswaList.add(new Siswa("Sarah", "Absen 34", "Kelas 10 PPLG 1", "Sarah has a keen interest in environmental science and often shares articles about sustainability."));
//        siswaList.add(new Siswa("Sasi", "Absen 35", "Kelas 10 PPLG 1", "Sasi enjoys playing sports and is a member of the school's badminton team."));
//        siswaList.add(new Siswa("Zaky", "Absen 36", "Kelas 10 PPLG 1", "Zaky is an ambitious student with dreams of becoming a successful entrepreneur."));
//        siswaList.add(new Siswa("Fikar", "Absen 37", "Kelas 10 PPLG 1", "Fikar is known for his love of music and plays the piano during his free time."));


        siswaList.add(new Siswa("Interstellar", "Rp 40.000", "Bioskop 1",
                "From the visionary mind of Christopher Nolan, Interstellar takes you on an emotional and breathtaking journey beyond the stars. With Earth on the brink of collapse, a group of astronauts embarks on a desperate mission to find humanity’s new home. Stunning visuals, deep emotional storytelling, and a thought-provoking look at time and space make this a must-watch.",
                R.drawable.interstellar));

        siswaList.add(new Siswa("Red", "Rp 35.000", "Bioskop 2",
                "What happens when retired spies are forced back into action? Explosive action, hilarious moments, and an all-star cast make Red an action-comedy you don’t want to miss. Brace yourself for thrilling fight sequences, clever humor, and a story that keeps you hooked till the very end!",
                R.drawable.red));

        siswaList.add(new Siswa("The Angry Birds Movie", "Rp 45.000", "Bioskop 3",
                "The world’s most beloved mobile game comes to life in this fun, action-packed adventure! Join Red, Chuck, and Bomb as they uncover a mysterious plot by the mischievous green pigs. With hilarious moments and heartwarming friendships, this movie is perfect for the whole family!",
                R.drawable.angry_birds));

        siswaList.add(new Siswa("Inception", "Rp 50.000", "Bioskop 4",
                "A mind-bending thriller that will keep you questioning reality. Christopher Nolan’s masterpiece follows Dom Cobb, a thief who enters dreams to steal secrets. But what if he’s trapped inside his own mind? Stunning visuals, a gripping story, and a legendary soundtrack make this an unforgettable cinematic experience.",
                R.drawable.inception));

        siswaList.add(new Siswa("Avatar", "Rp 55.000", "Bioskop 5",
                "James Cameron’s Avatar is more than a movie—it’s an experience. Travel to the breathtaking world of Pandora, where humans battle the native Na’vi in a fight for survival. With groundbreaking visuals, an epic love story, and heart-stopping action, this film redefined cinema. Don’t miss it on the big screen!",
                R.drawable.avatar));

        siswaList.add(new Siswa("The Dark Knight", "Rp 60.000", "Bioskop 6",
                "The best Batman movie ever made? Many would say yes! Christopher Nolan’s The Dark Knight pits Christian Bale’s Batman against Heath Ledger’s legendary Joker in a dark and thrilling battle for Gotham. Action, tension, and one of the best performances in film history—this is a must-watch!",
                R.drawable.dark_knight));

        siswaList.add(new Siswa("Avengers: Endgame", "Rp 65.000", "Bioskop 7",
                "The most epic superhero movie of all time. Avengers: Endgame brings together all your favorite Marvel heroes in one final battle against Thanos. Emotional, action-packed, and filled with unforgettable moments, this is the ultimate cinematic event you cannot afford to miss!",
                R.drawable.endgame));

        siswaList.add(new Siswa("Guardians of the Galaxy", "Rp 70.000", "Bioskop 8",
                "A group of misfits, a talking raccoon, a dancing tree, and an epic space adventure! Guardians of the Galaxy is a hilarious and action-packed Marvel film that proves even the unlikeliest heroes can save the universe. With a killer soundtrack and non-stop entertainment, you’ll want to watch this again and again!",
                R.drawable.guardians));

        siswaList.add(new Siswa("Titanic", "Rp 75.000", "Bioskop 9",
                "A love story for the ages. James Cameron’s Titanic brings romance, tragedy, and history together in one unforgettable movie. Follow Jack and Rose as they defy social norms and fall in love—only to face the disaster that changed history forever. Get ready to feel all the emotions!",
                R.drawable.titanic));

        siswaList.add(new Siswa("Jurassic World", "Rp 80.000", "Bioskop 10",
                "Dinosaurs are back—and they’re bigger, scarier, and more thrilling than ever! Jurassic World takes you to a fully operational dinosaur theme park... until things go horribly wrong. Packed with intense action and breathtaking visuals, this is the ultimate adventure movie!",
                R.drawable.jurassic_world));

        siswaList.add(new Siswa("The Lion King", "Rp 85.000", "Bioskop 11",
                "A timeless Disney masterpiece that will touch your heart. Follow Simba’s journey from a young cub to the King of the Pride Lands. With beautiful animation, iconic songs, and a powerful story, The Lion King is a movie that will stay with you forever.",
                R.drawable.lion_king));

        siswaList.add(new Siswa("Frozen", "Rp 90.000", "Bioskop 12",
                "Let it go, let it go! Frozen is a magical Disney adventure about sisterhood, love, and finding your own strength. With breathtaking animation, unforgettable songs, and lovable characters, this is one movie you’ll want to watch again and again!",
                R.drawable.frozen));

        siswaList.add(new Siswa("Shrek", "Rp 95.000", "Bioskop 13",
                "An ogre, a talking donkey, and a fairy tale like no other! Shrek flips traditional fairy tales upside down with its hilarious characters, fun adventure, and heartwarming message. If you love laughter and a great story, this is the movie for you!",
                R.drawable.shrek));

        siswaList.add(new Siswa("Toy Story 4", "Rp 100.000", "Bioskop 14",
                "Woody, Buzz, and the gang are back for one last adventure! Toy Story 4 is a heartwarming and exciting journey about friendship, love, and finding your place in the world. A perfect movie for all ages!",
                R.drawable.toy_story4));

        siswaList.add(new Siswa("Star Wars: The Force Awakens", "Rp 105.000", "Bioskop 15",
                "The force is strong with this one! Star Wars: The Force Awakens brings back the legendary saga with new heroes, old friends, and thrilling space battles. If you love epic adventures, this is the movie for you!",
                R.drawable.force_awakens));


        // Set adapter with the listener
        adapter = new Adapter(siswaList, this); // Pass `this` as the listener
        recyclerView.setAdapter(adapter);
    }

    // Implement the interface method to handle the item click
    @Override
    public void onItemClick(Siswa siswa) {
        // Handle item click
        Toast.makeText(RecyclerViewActivity.this, "Information About " + siswa.getName(), Toast.LENGTH_SHORT).show();

        // Start the next activity with the Siswa details
        Intent intent = new Intent(RecyclerViewActivity.this, DetailActivity.class);
        intent.putExtra("name", siswa.getName());
        intent.putExtra("absen", siswa.getAbsen());
        intent.putExtra("kelas", siswa.getKelas());
        intent.putExtra("deskripsi", siswa.getDeskripsi()); // Pass the description data
        intent.putExtra("imageResId", siswa.getImageResId());
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(RecyclerViewActivity.this, Login.class);
        startActivity(intent);
    }
}
