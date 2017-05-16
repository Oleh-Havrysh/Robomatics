package ua.nure.havrysh.robomatics.presenter;

import android.app.ActionBar;

import ua.nure.havrysh.robomatics.domain.facade.SketchFacade;
import ua.nure.havrysh.robomatics.presenter.view.SketchView;
import ua.nure.havrysh.robomatics.router.base.SketchRouter;

public class SketchPresenter extends BasePresenter<SketchRouter, SketchView> {

    private final SketchFacade sketchFacade;

    public SketchPresenter(SketchRouter router, SketchFacade sketchFacade) {
        super(router);
        this.sketchFacade = sketchFacade;
    }

    @Override
    public void setupActionBar(ActionBar actionBar) {
        actionBar.setTitle("Sketch");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
