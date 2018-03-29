# tpSensores

* Ciclo de ejecucion de los metodos del patron

Teniendo los objetos observable y observer, el primer metodo que se utiliza es el addObserver() para determinar quien observa a quien.
Luego si el objeto observable realiza algun cambio en su estado debe realizar el metodo setchange() y luego notifyall() para notificar a todos los observer de la lista.
Finalmente el objeto observer implementa el metodo update() en el caso que quiera realizar una accion ante un determinado combio.

* Metodo update

El metodo update se ejecuta cuando el objeto observable notifica de algun cambio.
Los argumentos que recibe por parametro el metodo update es el objeto observable con su modificacion ya hecha y un object que se pasa en los parametros del notifyall(ALGO)
