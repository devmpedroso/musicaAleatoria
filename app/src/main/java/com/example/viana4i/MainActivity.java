package com.example.viana4i;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sortear(View view) {

        int numero = new Random().nextInt(5);
        TextView textResultado = findViewById(R.id.textResultado);
        String[] musica = new String[5];

        musica[0] = "Há um monstro na água, farejando seu sangue\n" +
                "Uma Bijuu sem cauda, Hoshigaki Kisame\n" +
                "Minhas escamas não sabem o que é a trégua\n" +
                "Avisem que há um tubarão\n" +
                "Entre os Sete Espadachins da Névoa\n" +
                "Com a Samehada, cara, eu tenho muito chakra\n" +
                "Nunca me derrotarão, vai, Gai, pode abrir o Sexto Portão\n" +
                "E eu prefiro tirar minha vida do que passar mais uma informação\n" +
                "Foi como Itachi disse \"só na minha morte\"\n" +
                "\"Eu descobri, da minha vida, qual foi a razão\" (yeah)";
        musica[1] = "Itachi Uchiha, sou como um corvo\n" +
                "Nukenin procurado por traição\n" +
                "Eu matei meu clã, o meu pai e minha mãe\n" +
                "Tudo isso na frente do meu irmão\n" +
                "Quanta arrogância\n" +
                "Sasuke, 'cê não vai me derrotar\n" +
                "'Cê não passa de uma criança\n" +
                "Nunca vai ter sua vingança\n" +
                "Enquanto não tiver meus olhos\n" +
                "Meu irmão, te falta ódio";
        musica[2] = "Meu nome é Pain, no pain, no gain\n" +
                "Destruí Konoha com Shinra Tensei\n" +
                "'To com a minha gang e eu já falei\n" +
                "A verdadeira dor pro mundo mostrarei\n" +
                "Fora da lei, me vingarei\n" +
                "Com Rinnegan, um deus eu me tornei\n" +
                "Ensinarei a dor pra vocês\n" +
                "Chorem ao ver eu matar meu sensei\n" +
                "Só tem Rank-S, então vê se não mexe\n" +
                "Comparados com a gente, os Kages parecem moleques (oyê)\n" +
                "Eu vou explodir sua vila (sua vila)\n" +
                "Me chamem de terrorista ('rista)\n" +
                "Mantenho minha ideologia ('gia)\n" +
                "Hoje eu vou salvar suas vidas\n" +
                "Isso não é uma chacina\n" +
                "Isso é Punição Divina";
        musica[3] = "De uma terra onde a chuva sempre cai do céu\n" +
                "Ouça o bater de asas de um anjo de papel\n" +
                "Só mais uma órfã de guerra, o mundo é tão cruel\n" +
                "Quero proteger Nagato, esse é o meu papel\n" +
                "Na Vila da Chuva (ah), tristeza nas ruas (hey)\n" +
                "Por que tantas guerras? (Por quê?)\n" +
                "De quem é a culpa? (Ooh)\n" +
                "Já avisei pra vocês\n" +
                "Vou matar quem entrar (entrar, entrar)\n" +
                "No caminho de Pain";
        musica[4] = "É que eu sou imortal, sobrenatural\n" +
                "Se preparem porque vai começar o ritual (yeah)\n" +
                "Mato todos no meu caminho\n" +
                "Em nome do Deus Jashin\n" +
                "Eu sou mau, não tem ninguém igual\n" +
                "Um ataque da foice é uma ferida letal (-al)\n" +
                "'Tá com medo? Assuma\n" +
                "Eu que matei o Asuma\n" +
                "Nukenin com a gang\n" +
                "Me enterre, okay (okay)\n" +
                "Não morri, trolei\n" +
                "Igual um zumbi, voltei (Racks on racks)\n" +
                "Sabe que eu retalho, corto e estraçalho\n" +
                "Shikamaru Nara tem mó cara de otário\n" +
                "Falam, falam, falam, mas nunca são páreo'\n" +
                "Não são adversários, só fracassos, vão pra casa do caralho";

        textResultado.setText(musica[numero]);
    }
}