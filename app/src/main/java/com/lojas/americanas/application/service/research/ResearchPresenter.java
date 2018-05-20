package com.lojas.americanas.application.service.research;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

import com.lojas.americanas.R;
import com.lojas.americanas.application.service.IResearchView;
import com.lojas.americanas.domain.model.Produto;

import org.json.JSONArray;

import java.util.List;

public class ResearchPresenter {
    Context context;
    private IResearchView view;
    private ResearchService service;

    public ResearchPresenter(Context context, IResearchView view){
        this.context = context;
        this.service = new ResearchService(context, view);
        this.view = view;
    }

    public void buscar() {
        try{
            String parameter = view.getParameter();
            if (parameter.isEmpty()) {
                view.error(R.string.research_error_parameter);
                return;
            }

            new Thread(new Runnable() {
                @Override
                public void run() {
                    Message msg = new Message();
                    msg.arg1 = 0;
                    msg.obj = null;
                    List<Produto> result = null;
                    do{
                        try{
                            result = service.buscar();
                            if(result != null && result.size()>0){
                                msg.arg1 = 1;
                                msg.obj = result;
                            }
                        }catch (Exception e){ e.getMessage().toString(); }
                    }while (result == null);
                    handler.sendMessage(msg);
                }
                Handler handler = new Handler(){
                    @Override
                    public void handleMessage(Message msg) {
                        super.handleMessage(msg);
                        if(msg.arg1 == 0){
                            view.error(R.string.research_error_busca);
                        }else{
                            List<Produto> result = (List<Produto>) msg.obj;

                            if(result != null && result.size()>0){
                                view.showResult(result);
                            }
                        }
                    }
                };
            }).start();
        }catch (Exception e){
            e.getMessage().toString();
        }
    }
}