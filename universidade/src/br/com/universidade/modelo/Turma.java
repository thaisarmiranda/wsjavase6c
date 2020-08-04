package br.com.universidade.modelo;

public class Turma {

	private String nome;
	private Curso curso;
	private String periodo;
	private Aluno aluno;
	
	public String getAll() {
		return
				"\n==============================\nDADOS DO CURSO\n==============================\n" + "\n" +
				"Turma........: " + nome + "\n" +
				curso.getAll() + "\n" +
				"Per�odo......: " + periodo + "\n" +
				aluno.getAll();
	}
	
	public void setAll(String nome, Curso curso, String periodo, Aluno aluno) {
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
		this.aluno = aluno;
	}
	
	public Turma() {
		super();
	}
	public Turma(String nome, Curso curso, String periodo, Aluno aluno) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
		this.aluno = aluno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
		
}
