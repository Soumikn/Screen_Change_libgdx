package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class Screen1 implements Screen {

    MyGdxGame h;

    public Screen1(MyGdxGame _h)
    {
        this.h=_h;
    }

    public Screen1()
    {

    }

    @Override
    public void render(float delta) {
        // TODO Auto-generated method stub
        Gdx.gl.glClearColor(0.18f,0.21f,0.27f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

}