KC=	kotlinc
KFLAG=	-cp

all:	\
	Arco.class\
	Arista.class\
	GrafoNoDirigido.class\
	GrafoDirigido.class\
	MainKt.class

Arco.class: Arco.kt
	$(KC) Arco.kt

Arista.class: Arista.kt
	$(KC) Arista.kt

GrafoNoDirigido.class: GrafoNoDirigido.kt
	$(KC) $(KFLAG) . GrafoNoDirigido.kt

GrafoDirigido.class: GrafoDirigido.kt
	$(KC) $(KFLAG) . GrafoDirigido.kt

MainKt.class: Main.kt 
	$(KC) $(KFLAG) . Main.kt

clean:
	rm -rf *.class META-INF
