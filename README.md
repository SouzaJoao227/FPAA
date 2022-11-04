# FPAA

## Alunos integrantes da equipe

* Rafael Duarte
* Joao Vítor Rajão E Souza
* Vitor de Souza Xavier
* Vítor José Lara Bastos

## Professor responsável

* João Caram Santos de Oliveira

# Soma de subconjuntos com força bruta

Na  segunda  parte  da  disciplina,  estamos  estudando  problemas  de  difícil  solução  computacional, 
tipicamente pertencente às classes NP, e as técnicas de projeto de algoritmos que podem nos ajudar a 
encontrar uma solução de compromisso adequada.  
  
Para aquecer, neste trabalho iremos investigar como pode ser limitante precisar resolver um problema 
usando força bruta.  
 
O problema a ser tratado é da soma de subconjuntos: dado um conjunto C de números inteiros c1, c2, 
c3, c4... cn, existe um subconjunto de C cuja soma dos elementos atinge exatamente um valor V? 
 
As tarefas preliminares do seu grupo de trabalho são: 
 
a) Projetar  e  implementar  uma  solução  para  o  problema  da  soma  de  subconjuntos  utilizando 
força bruta. 

b) Criar um método “gerador de conjuntos”. Este método  deve  receber  como  parâmetro  o 
tamanho do conjunto a ser criado e retornar um conjunto deste tamanho, contendo valores 
inteiros aleatórios entre 1 e 9. 

A tarefa principal tem duas partes: 

a) Criar um teste automatizado. Este teste deve gerar  conjuntos de tamanho crescente a partir 
de 2 e tentar resolver o problema da soma de subconjuntos com V igual à média da soma de 
todos os elementos do conjunto. O teste de cada tamanho de conjunto deve ser repetido 150 
vezes,  registrando  o  tempo  médio  de  solução  para  cada  tamanho  de  conjunto.  O  teste  será 
interrompido quando a média das soluções superar 4 segundos. 

b) A partir dos resultados de (a), criar um relatório contendo: 
a. Um gráfico com o crescimento do tempo médio de solução obtido.  
b. Com estes dados, estimar qual seria o tempo necessário para encontrar uma soma em 
um conjunto com 100 elementos. 
Observe que um teste deste porte vai demorar mais de 10 minutos para a última iteração. Vocês podem 
particionar o teste, se desejarem, em diversas execuções menores, mas sempre no mesmo equipamento 
para não causar distorções.   
 
Regras: 
• Grupos  de  4  alunos.  Caso um  grupo  tenha menos  alunos, estará  sujeito  à  alocação  de  alunos 
para completar as vagas por parte do professor; 
• Este trabalho não tem apresentação ao professor, apenas uma entrega no Canvas; 
• Entrega obrigatória em um arquivo zip, contendo os códigos-fonte Java e o relatório em PDF. 


