package geekygirl.prog.dev.gouvernorate.ui.main;

import java.util.List;

public interface MainView {

    public void showProgress();

    public void hideProgress();

    public void setItems(List<String> items);

    public void showMessage(String message);
}
