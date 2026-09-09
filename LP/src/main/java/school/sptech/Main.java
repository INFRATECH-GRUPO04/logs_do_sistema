package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


        gerarLog(
                "LOGIN",
                "INFO",
                "Roberto",
                "Dashboard",
                "Autenticação",
                "Sucesso",
                "Usuário realizou autenticação com sucesso",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ACESSO",
                "INFO",
                "Amanda",
                "Dashboard",
                "Monitoramento",
                "Sucesso",
                "Usuário acessou o painel de monitoramento",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ALERTA",
                "CRÍTICO",
                "Sistema",
                "Servidor-01",
                "CPU",
                "97% Limite:90%",
                "Utilização de CPU atingiu nível crítico",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ALERTA",
                "AVISO",
                "Sistema",
                "Servidor-02",
                "RAM",
                "84% Limite:80%",
                "Utilização de RAM acima do limite configurado",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ALERTA",
                "CRÍTICO",
                "Sistema",
                "Servidor-03",
                "DISCO",
                "96% Limite:90%",
                "Espaço disponível em disco está baixo",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ALERTA",
                "AVISO",
                "Sistema",
                "Servidor-04",
                "CPU",
                "82% Limite:80%",
                "Uso elevado de CPU detectado",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ALERTA",
                "CRÍTICO",
                "Sistema",
                "Servidor-01",
                "RAM",
                "94% Limite:90%",
                "Memória RAM próxima da capacidade máxima",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ALERTA",
                "AVISO",
                "Sistema",
                "Servidor-02",
                "DISCO",
                "83% Limite:80%",
                "Utilização de disco acima do limite configurado",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "NORMALIZAÇÃO",
                "INFO",
                "Sistema",
                "Servidor-04",
                "CPU",
                "65% Limite:80%",
                "Utilização de CPU retornou ao nível normal",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "NORMALIZAÇÃO",
                "INFO",
                "Sistema",
                "Servidor-01",
                "RAM",
                "72% Limite:90%",
                "Utilização de RAM retornou ao nível normal",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ERRO",
                "CRÍTICO",
                "Sistema",
                "Dashboard",
                "Banco de Dados",
                "Falha",
                "Falha ao conectar com o banco de dados",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ERRO",
                "CRÍTICO",
                "Sistema",
                "Dashboard",
                "Banco de Dados",
                "Consulta",
                "Erro ao consultar dados no banco",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ERRO",
                "CRÍTICO",
                "Sistema",
                "Dashboard",
                "Rota /dashboard",
                "404",
                "Rota solicitada não foi encontrada",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "ERRO",
                "AVISO",
                "Sistema",
                "Dashboard",
                "Atualização",
                "Falha",
                "Falha na atualização dos dados da dashboard",
                formato
        );

        Thread.sleep(3000);


        gerarLog(
                "LOGOUT",
                "INFO",
                "Rafael",
                "Dashboard",
                "Autenticação",
                "Sucesso",
                "Usuário encerrou a sessão",
                formato
        );
    }


    public static void gerarLog(
            String tipo,
            String severidade,
            String usuario,
            String servidor,
            String recurso,
            String valor,
            String mensagem,
            DateTimeFormatter formato) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(
                agora.format(formato)
                        + " " + tipo
                        + " " + severidade
                        + " " + usuario
                        + " " + servidor
                        + " " + recurso
                        + " " + valor
                        + " " + mensagem
        );
    }
}