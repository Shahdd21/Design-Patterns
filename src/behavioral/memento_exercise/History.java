package behavioral.memento_exercise;

import java.util.Stack;

public class History {
    private final Stack<DrawingState> prevStates;

    public History() {
        this.prevStates = new Stack<>();
    }

    public void saveState(DrawingState drawingState){
        prevStates.push(drawingState);
    }

    public DrawingState undo(){
        if(!prevStates.isEmpty()){
            return prevStates.pop();
        }

        return null;
    }
}
