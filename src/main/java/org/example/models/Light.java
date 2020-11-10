package org.example.models;

public class Light extends Thing{

    public interface OnLightChangedListener {
        void onLightChanged(Light light);
    }

    private OnLightChangedListener onLightChangedListener;
    private boolean isLightOn = false;

    @Override
    public String getTypeName() {
        return "Light";
    }

    @Override
    public String getDescription() {
        return "Light is on :"+isLightOn;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public void setLightOn(boolean lightOn) {
        if(state == State.UNREACHABLE){
            return;
        }

        isLightOn = lightOn;
        if(onLightChangedListener != null){
            onLightChangedListener.onLightChanged(this);
        }
    }

    public void setOnLightChangedListener(OnLightChangedListener onLightChangedListener) {
        this.onLightChangedListener = onLightChangedListener;
    }
}
