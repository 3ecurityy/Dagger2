package ir.mohammadrezaarabi.dagger2;

public class Board {
    Camera camera;
    Storage storage;

    Board(Camera camera, Storage storage) {
        this.camera = camera;
        this.storage = storage;
    }
}
