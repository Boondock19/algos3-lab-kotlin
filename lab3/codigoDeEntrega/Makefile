KC=		kotlinc
KFLAG=		-cp
PKG_GRAPHLIB=	ve/usb/grafoLib

all:	\
	$(PKG_GRAPHLIB)/Color.class\
	$(PKG_GRAPHLIB)/Lado.class\
	$(PKG_GRAPHLIB)/Arco.class\
	$(PKG_GRAPHLIB)/Arista.class\
	$(PKG_GRAPHLIB)/Grafo.class\
	$(PKG_GRAPHLIB)/GrafoNoDirigido.class\
	$(PKG_GRAPHLIB)/GrafoDirigido.class\
	$(PKG_GRAPHLIB)/BusquedaEnAmplitud.class\
	$(PKG_GRAPHLIB)/BusquedaEnProfundidad.class\
	$(PKG_GRAPHLIB)/CicloDigrafo.class\
	$(PKG_GRAPHLIB)/UtilidadesKt.class\
	$(PKG_GRAPHLIB)/OrdenTopologico.class\
	$(PKG_GRAPHLIB)/CFC.class\

$(PKG_GRAPHLIB)/Color.class: $(PKG_GRAPHLIB)/Color.kt
	$(KC) $(PKG_GRAPHLIB)/Color.kt

$(PKG_GRAPHLIB)/Lado.class: $(PKG_GRAPHLIB)/Lado.kt
	$(KC) $(PKG_GRAPHLIB)/Lado.kt

$(PKG_GRAPHLIB)/Arco.class: $(PKG_GRAPHLIB)/Arco.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/Arco.kt

$(PKG_GRAPHLIB)/Arista.class: $(PKG_GRAPHLIB)/Arista.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/Arista.kt

$(PKG_GRAPHLIB)/Grafo.class: $(PKG_GRAPHLIB)/Grafo.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/Grafo.kt

$(PKG_GRAPHLIB)/GrafoNoDirigido.class: $(PKG_GRAPHLIB)/GrafoNoDirigido.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/GrafoNoDirigido.kt

$(PKG_GRAPHLIB)/GrafoDirigido.class: $(PKG_GRAPHLIB)/GrafoDirigido.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/GrafoDirigido.kt

$(PKG_GRAPHLIB)/BusquedaEnAmplitud.class: $(PKG_GRAPHLIB)/BusquedaEnAmplitud.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/BusquedaEnAmplitud.kt

$(PKG_GRAPHLIB)/BusquedaEnProfundidad.class: $(PKG_GRAPHLIB)/BusquedaEnProfundidad.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/BusquedaEnProfundidad.kt

$(PKG_GRAPHLIB)/CicloDigrafo.class: $(PKG_GRAPHLIB)/CicloDigrafo.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/CicloDigrafo.kt

$(PKG_GRAPHLIB)/OrdenTopologico.class: $(PKG_GRAPHLIB)/OrdenTopologico.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/OrdenTopologico.kt

$(PKG_GRAPHLIB)/UtilidadesKt.class: $(PKG_GRAPHLIB)/Utilidades.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/Utilidades.kt

$(PKG_GRAPHLIB)/CFC.class: $(PKG_GRAPHLIB)/CFC.kt
	$(KC) $(KFLAG) $(PKG_GRAPHLIB): $(PKG_GRAPHLIB)/CFC.kt

clean:
	rm -rf *.class META-INF $(PKG_GRAPHLIB)/*.class $(PKG_GRAPHLIB)/META-INF 
