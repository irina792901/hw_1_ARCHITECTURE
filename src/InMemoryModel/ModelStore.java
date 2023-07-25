package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.Scene;
import ModelElements.PoligonalModel;
import java.util.ArrayList;

public class ModelStore {
    public ArrayList<PoligonalModel> models;
        ArrayList<Scene> scenes;
        ArrayList<Flash> flashes;
        ArrayList<Camera> cameras;
    private ArrayList<IModelChangedObserver> changesObserves;

    public Scene getScene(int id) {
        return null;
    }

    public void NotifyChange(IModelChanger iModelChanger){}
}
