package com.calasans.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.calasans.model.PessoaModel;


public interface PessoaRepository extends Repository<PessoaModel, Integer> {

	PessoaModel save(PessoaModel pessoa);
	void delete(PessoaModel pessoa);
	List<PessoaModel> findAll();
	PessoaModel findOne(Integer id);
}



