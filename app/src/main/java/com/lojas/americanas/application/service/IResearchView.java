package com.lojas.americanas.application.service;

import com.lojas.americanas.domain.model.Produto;

import java.util.List;

public interface IResearchView {
    String getParameter();
    void showResult(List<Produto> value);
    void error(int resId);
}
