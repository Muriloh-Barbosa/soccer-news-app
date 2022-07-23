package desktop.murilo.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import desktop.murilo.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover mock de Noticias.
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria tem desfalque importante", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        news.add(new News("Ferroviaria joga no Sábado", "Ao contrário da crença popular, Lorem Ipsum não é simplesmente um texto aleatório"));
        news.add(new News("Copa do mundo feminina esta terminando", "Não há quem ame a própria dor, que a busque e queira tê-la, simplesmente porque é dor..."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getnews() {
        return this.news;
    }
}