# 🧪 SauceDemo Automation – Humberto Sosa

Este proyecto automatiza el flujo de compra en [SauceDemo](https://www.saucedemo.com) utilizando **Serenity BDD**, **Cucumber** y **Selenium WebDriver**, con integración de **WebDriverManager** para la gestión automática del driver del navegador.

El proyecto implementa el patrón de diseño **Page Object Model (POM)** para una mejor organización, reutilización y mantenimiento del código.

---

## 📋 Características principales

- Automatización de pruebas end-to-end del proceso de compra.
- Uso de escenarios con múltiples ejemplos usando `Scenario Outline`.
- Arquitectura basada en **POM**.
- Generación de reportes detallados con Serenity.
- Compatible con **Firefox** (sin necesidad de configurar manualmente el driver).

---

## ✅ Requisitos previos

Asegúrate de tener lo siguiente instalado en tu sistema:

- [Java JDK 11 o superior](https://adoptium.net/)
- [Apache Maven](https://maven.apache.org/)
- [Firefox](https://www.mozilla.org/firefox/) (navegador instalado localmente)

> **Nota:** No necesitas descargar geckodriver manualmente. WebDriverManager lo gestiona automáticamente.

---

## 🚀 Cómo ejecutar los tests

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/tu-usuario/saucedemo-serenity.git
   cd saucedemo-serenity

2. **Ejecutar pruebas desde consola**

	mvn clean verify -Dtest=co.com.saucedemo.RunnerTest

## Reportes
**Ubicación del reporte**
target/site/serenity/index.html

## Evidencia de Ejecución

**Terminal con ejecución de pruebas**

![Captura de pantalla 2025-06-11 a la(s) 4 46 41 p m](https://github.com/user-attachments/assets/8cedce5a-1228-4a2f-a95e-94cfaf3bca22)

**Imagen del reporte**

![Captura de pantalla 2025-06-11 a la(s) 4 47 31 p m](https://github.com/user-attachments/assets/0db5df1e-f931-46b3-81b4-5a63105d638d)

## ✅ Conclusiones

- Se logró automatizar exitosamente el flujo de compra del sitio [SauceDemo](https://www.saucedemo.com) utilizando **Serenity BDD**, **Cucumber** y el patrón de diseño **Page Object Model (POM)**, lo que facilita la escalabilidad y mantenimiento del código.
- Se integró **WebDriverManager** para evitar la configuración manual de drivers, asegurando una ejecución más fluida y portable.
- Se aplicó un escenario parametrizado con `Scenario Outline`, permitiendo reutilizar pasos con distintos datos para mayor cobertura.
- La estructura modular del proyecto mejora la legibilidad, separación de responsabilidades y facilita la detección de errores.

---

## 🚧 Impedimentos y problemas enfrentados

- **Bloqueo por popups de Google/Firefox**: Durante las pruebas, algunos popups del navegador (relacionados con privacidad o actualizaciones de Firefox) interferían con la ejecución automática. Se resolvió configurando Firefox para suprimir ventanas emergentes en modo automatizado.
- **Dependencias de navegador**: Inicialmente no se reconocía el driver de Firefox. Fue necesario incluir correctamente WebDriverManager y asegurarse de que Firefox estuviera instalado localmente.
- **Problemas de compatibilidad con anotaciones de Serenity**: Al intentar usar `@FindAll`, se identificó que el paquete estaba obsoleto o mal referenciado. Se optó por usar selectores más directos con Serenity.
- **Errores con Step Definitions**: Al migrar los `features` a español y usar `Scenario Outline`, los placeholders como `<usuario>` no se reconocían hasta que se encapsularon correctamente entre comillas (`"<usuario>"`).
- **Errores de autenticación al subir a GitHub**: Se presentó un error 403 al hacer `git push` debido a configuraciones incorrectas del remoto y problemas con las credenciales. Se resolvió con autenticación mediante token personal (PAT) y configuración correcta del `remote`.

