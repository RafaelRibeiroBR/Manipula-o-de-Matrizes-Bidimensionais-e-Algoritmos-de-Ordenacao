Relatório Final

Descrição da classe Matriz

A classe `Matriz` é responsável por representar uma matriz bidimensional de inteiros. Ela possui três atributos principais: `matriz`, que guarda os elementos; `linhas`, que define a quantidade de linhas; e `colunas`, que define a quantidade de colunas.
Para manipular essa matriz, criamos métodos que permitem preenchê-la manualmente ou automaticamente, exibir seus valores, e ordená-la de diferentes formas: por linha, por coluna ou totalmente. O objetivo é organizar e manipular os dados de maneira clara e eficiente.



 Lógica utilizada em cada funcionalidade

Preenchimento manual: usamos dois loops `for` para percorrer todas as posições da matriz e pedimos ao usuário que digite cada valor.
Preenchimento automático: também percorremos todas as posições da matriz, mas os valores são gerados aleatoriamente usando a classe `Random`.
Exibição da matriz: percorremos a matriz e imprimimos os elementos linha por linha, para que a visualização fique organizada.
Ordenação por linhas: aplicamos o Bubble Sort em cada linha, ordenando os elementos horizontalmente.
Ordenação por colunas: extraímos cada coluna para um vetor temporário, ordenamos com Bubble Sort e devolvemos para a matriz.
Ordenação completa: transformamos a matriz em um vetor unidimensional, aplicamos Merge Sort recursivo e depois reconstruímos a matriz. Assim, todos os elementos ficam ordenados globalmente.



Comparação entre os algoritmos de ordenação

Escolhemos dois algoritmos diferentes para comparar suas abordagens:

Bubble Sort: é iterativo e compara elementos vizinhos várias vezes. É simples de implementar, mas não é eficiente para matrizes grandes, pois sua complexidade cresce quadráticamente.
Merge Sort: é recursivo e divide o vetor em partes menores, ordena cada uma e depois combina os resultados. É mais eficiente, mesmo para matrizes grandes, e tem complexidade de O(n log n).

Podemos perceber que o Bubble Sort funciona bem para pequenas matrizes ou quando os dados já estão quase ordenados, enquanto o Merge Sort é a melhor opção para conjuntos maiores de números.

Conclusões

Durante o desenvolvimento do projeto, enfrentamos alguns desafios. Entre eles, entender como percorrer a matriz por linhas e colunas corretamente e implementar a ordenação completa usando vetor 1D. Também foi interessante aprender a diferença entre algoritmos iterativos e recursivos.
No final, o projeto trouxe vários aprendizados importantes: organizar código em classes e métodos, entender na prática a diferença entre Bubble Sort e Merge Sort, e estruturar um programa passo a passo, considerando entradas do usuário, processamento e saída de dados.
Podemos concluir que, apesar das dificuldades, conseguimos implementar uma matriz totalmente funcional, com diferentes formas de ordenação e exibição, e o processo nos ajudou a consolidar conceitos de programação e algoritmos de ordenação.

