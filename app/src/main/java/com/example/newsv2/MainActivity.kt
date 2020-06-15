package com.example.newsv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageList = listOf<ItemOfList>(
            ItemOfList(
                R.drawable.img1,
                "Перенос аниме весеннего сезона на неопределенный срок из-за короновируса",
                "С прошлой недели студии начали сворачивать выпуск новых серий онгоингов и анонсов," +
                        "перенося свою работу на непредвиденный срок. Список тайтлов:" +
                        "Evangelion: 3.0+1.0 - полнометражный фильм" +
                        "Мастера Меча Онлайн: Алисизация - Война в Подмирье 2" +
                        "Кулинарные поединки Сомы: Пятое блюдо" +
                        "Как и ожидал, моя школьная романтическая жизнь не удалась ТВ-3" +
                        "Re:Zero. Жизнь с нуля в альтернативном мире 2"
            ),
            ItemOfList(
                R.drawable.img2,
                "Итальянский «Удинезе» хочет купить хавбека «Уфы»",
                "Полузащитник «Уфы» Даниил Фомин может продолжить карьеру в итальянской Серии А. Интерес к 23-летнему хавбеку проявляет «Удинезе», сообщает «Спорт Экспресс».\n" +
                        "\n" +
                        "По информации источника, представители итальянского клуба уже давно следят за игроком и хотят осуществить его трансфер после окончания текущего сезона.\n" +
                        "\n" +
                        "Представители «Уфы» также подтвердили интерес к Фомину со стороны «Удинезе»."
            ),
            ItemOfList(
                R.drawable.img3,
                "Команда Virtus.pro стала чемпионом турнира ESL One LA 2020 - Online: Eu & CIS",
                "СНГ команда Virtus.pro заняла первое место на турнире ESL One LA 2020 - Online: Eu & CIS," +
                        "Одолев в гранд-финале команду OG со счетом 3-2 (отыгравшись со счета 0-2), и заработала 60.000$."
            ),
            ItemOfList(
                R.drawable.img4,
                "Команда MadLions выиграла турнир Flashpoint Season 1",
                "Команда MadLions выиграла турнир Flashpoint Season 1, одолев в финале команду MIBR." +
                        "Тем самым датская пятерка выиграла 500.000$."+
                        "Счет по картам:"+
                        "Mirage (Mad Lions pick)" +
                        "MIBR 16 - 13 Mad Lions" +
                        "Inferno (MIBR pick)"+
                        "MIBR 13 - 16 Mad Lions" +
                        "Train (Decider map)" +
                        "MIBR 13 - 16 Mad Lions"
            )
        )

        val recyclerView= findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter (this, imageList){
            val intent = Intent (this, DetailActivity ::class.java)
            intent.putExtra("OBJECT INTENT",it)
            startActivity(intent)
        }

    }

}
