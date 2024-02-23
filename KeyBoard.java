import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener{
    private boolean aPressed, bPressed, cPressed, dPressed, ePressed, fPressed, gPressed, hPressed,
    iPressed, jPressed, kPressed, lPressed, mPressed, nPressed, oPressed, pPressed, qPressed,
    rPressed, sPressed, tPressed, uPressed, vPressed, wPressed, xPressed, yPressed, zPressed,
    upPressed, downPressed, rightPressed, leftPressed, spacePressed, shiftPressed;
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyPressed(KeyEvent e){
        setKeys(e, true);
    }
    @Override
    public void keyReleased(KeyEvent e){
        setKeys(e, false);
    }
    private void setKeys(KeyEvent e, boolean setTo){
        switch(e.getKeyCode()){
            case KeyEvent.VK_KP_UP:
                upPressed = setTo;
                break;
            case KeyEvent.VK_KP_DOWN:
                downPressed = setTo;
                break;
            case KeyEvent.VK_KP_RIGHT:
                rightPressed = setTo;
                break;
            case KeyEvent.VK_KP_LEFT:
                leftPressed = setTo;
                break;
            case KeyEvent.VK_SHIFT:
                rightPressed = setTo;
                break;
            case KeyEvent.VK_A:
                rightPressed = setTo;
                break;
            case KeyEvent.VK_B:
                bPressed = setTo;
                break;
            case KeyEvent.VK_C:
                cPressed = setTo;
                break;
            case KeyEvent.VK_D:
                dPressed = setTo;
                break;
            case KeyEvent.VK_E:
                ePressed = setTo;
                break;
            case KeyEvent.VK_F:
                fPressed = setTo;
                break;
            case KeyEvent.VK_G:
                gPressed = setTo;
                break;
            case KeyEvent.VK_H:
                hPressed = setTo;
                break;
            case KeyEvent.VK_I:
                iPressed = setTo;
                break;
            case KeyEvent.VK_J:
                jPressed = setTo;
                break;
            case KeyEvent.VK_K:
                kPressed = setTo;
                break;
            case KeyEvent.VK_L:
                lPressed = setTo;
                break;
            case KeyEvent.VK_M:
                mPressed = setTo;
                break;
            case KeyEvent.VK_N:
                nPressed = setTo;
                break;
            case KeyEvent.VK_O:
                oPressed = setTo;
                break;
            case KeyEvent.VK_P:
                pPressed = setTo;
                break;
            case KeyEvent.VK_Q:
                qPressed = setTo;
                break;
            case KeyEvent.VK_R:
                rPressed = setTo;
                break;
            case KeyEvent.VK_S:
                sPressed = setTo;
                break;
            case KeyEvent.VK_T:
                tPressed = setTo;
                break;
            case KeyEvent.VK_U:
                uPressed = setTo;
                break;
            case KeyEvent.VK_V:
                vPressed = setTo;
                break;
            case KeyEvent.VK_W:
                wPressed = setTo;
                break;
            case KeyEvent.VK_X:
                xPressed = setTo;
                break;
            case KeyEvent.VK_Y:
                yPressed = setTo;
                break;
            case KeyEvent.VK_Z:
                zPressed = setTo;
                break;
        }
    }
    public boolean upPressed(){
        return this.upPressed;
    }
    public boolean downPressed(){
        return this.downPressed;
    }
    public boolean leftPressed(){
        return this.leftPressed;
    }
    public boolean rightPressed(){
        return this.rightPressed;
    }
    public boolean spacePressed(){
        return this.spacePressed;
    }
    public boolean shiftPressed(){
        return this.shiftPressed;
    }
    public boolean aPressed(){
        return this.aPressed;
    }
    
    public boolean bPressed(){
        return this.bPressed;
    }
    
    public boolean cPressed(){
        return this.cPressed;
    }
    
    public boolean dPressed(){
        return this.dPressed;
    }
    
    public boolean ePressed(){
        return this.ePressed;
    }
    
    public boolean fPressed(){
        return this.fPressed;
    }
    
    public boolean gPressed(){
        return this.gPressed;
    }
    
    public boolean hPressed(){
        return this.hPressed;
    }
    
    public boolean iPressed(){
        return this.iPressed;
    }
    
    public boolean jPressed(){
        return this.jPressed;
    }
    
    public boolean kPressed(){
        return this.kPressed;
    }
    
    public boolean lPressed(){
        return this.lPressed;
    }
    
    public boolean mPressed(){
        return this.mPressed;
    }
    
    public boolean nPressed(){
        return this.nPressed;
    }
    
    public boolean oPressed(){
        return this.oPressed;
    }
    
    public boolean pPressed(){
        return this.pPressed;
    }
    
    public boolean qPressed(){
        return this.qPressed;
    }
    
    public boolean rPressed(){
        return this.rPressed;
    }
    
    public boolean sPressed(){
        return this.sPressed;
    }
    
    public boolean tPressed(){
        return this.tPressed;
    }
    
    public boolean uPressed(){
        return this.uPressed;
    }
    
    public boolean vPressed(){
        return this.vPressed;
    }
    
    public boolean wPressed(){
        return this.wPressed;
    }
    
    public boolean xPressed(){
        return this.xPressed;
    }
    
    public boolean yPressed(){
        return this.yPressed;
    }
    
    public boolean zPressed(){
        return this.zPressed;
    }
}