package dev.franz.noticiastech

import dev.franz.noticiastech.models.infoTech
import kotlin.collections.ArrayList

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<infoTech> {

            val list = ArrayList<infoTech>()

            list.add(
                infoTech(
                    "Governo limita uso de recursos do fundo de ciência e tecnologia",
                    "Gabriela Bernardes e João Rosa, da CNN",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/11/analise_covid_19_coronavirus_laboratorio_ilustrativa-7.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/politica/governo-limita-uso-de-recursos-do-fundo-de-ciencia-e-tecnologia/"
                )
            )

            list.add(
                infoTech(
                    "Implantação do 5G agita mercado de smartphones seminovos",
                    "Lucas Agrela, do Estadão Conteúdo",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/11/celular_03.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/business/implantacao-do-5g-agita-mercado-de-smartphones-seminovos/"
                )
            )

            list.add(
                infoTech(
                    "Empresa indiana Reliance e Google vão desenvolver smartphone 5G de baixo custo",
                    "Munsif Vengattil, da Reuters",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2022/07/priscilla-du-preez-BjhUu6BpUZA-unsplash.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/business/empresa-indiana-reliance-e-google-vao-desenvolver-smartphone-5g-de-baixo-custo/"
                )
            )

            list.add(
                infoTech(
                    "Petrobras se prepara para instalar 5G em plataformas e unidades em terra",
                    "Denise Luna, do Estadão Conteúdo",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2022/08/GettyImages-1237878704.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/business/petrobras-se-prepara-para-instalar-5g-em-plataformas-e-unidades-em-terra/"
                )
            )

            list.add(
                infoTech(
                    "Ericsson anuncia encerramento gradual de atividades comerciais na Rússia",
                    "Olof Swahnberg da Reuters",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/Reuters_Direct_Media/BrazilOnlineReportTechnologyNews/tagreuters.com2022binary_LYNXMPEI7S0IQ-FILEDIMAGE.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/business/ericsson-anuncia-encerramento-gradual-de-atividades-comerciais-na-russia/"
                )
            )

            list.add(
                infoTech(
                    "EUA e China alcançam acordo histórico de auditoria que beneficia techs chinesas",
                    "Scott Murdoch e Xie Yu e Samuel Shen e Michelle Price, da Reuters",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/Reuters_Direct_Media/BrazilOnlineReportBusinessNews/tagreuters.com2022binary_LYNXMPEI5K0GV-FILEDIMAGE.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/business/eua-e-china-alcancam-acordo-historico-de-auditoria-que-beneficia-techs-chinesas/"
                )
            )

            list.add(
                infoTech(
                    "Saiba como funciona o site que rastreia voos em todo o mundo",
                    "Jacopo Prisco, da CNN",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2022/08/GettyImages-1217233096.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/tecnologia/saiba-como-funciona-o-site-que-rastreia-voos-em-todo-o-mundo/"
                )
            )

            list.add(
                infoTech(
                    "Levantamento mostra que ataques cibernéticos no Brasil cresceram 94%",
                    "Ingrid Oliveira, da CNN",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/Reuters_Direct_Media/BrazilOnlineReportTechnologyNews/tagreuters.com2021binary_LYNXMPEH7J0PI-VIEWIMAGE.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/tecnologia/levantamento-mostra-que-ataques-ciberneticos-no-brasil-cresceram-94/"
                )
            )

            list.add(
                infoTech(
                    "Como denúncias sobre cibersegurança no Twitter podem impactar acordo com Musk",
                    "Clare Duffy, da CNN",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/Reuters_Direct_Media/BrazilOnlineReportBusinessNews/tagreuters.com2022binary_LYNXNPEI4O10N-FILEDIMAGE.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/business/como-denuncias-sobre-ciberseguranca-no-twitter-podem-impactar-acordo-com-musk/"
                )
            )

            list.add(
                infoTech(
                    "Jogos criados por cientistas podem melhorar tratamento de AVC, diz estudo",
                    "Lucas Rocha, da CNN",
                    "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2022/08/video-game-idoso.jpg?w=350&h=195&crop=1",
                    "https://www.cnnbrasil.com.br/saude/jogos-criados-por-cientistas-podem-melhorar-tratamento-de-avc-diz-estudo/"
                )
            )


            return list
        }

    }
}