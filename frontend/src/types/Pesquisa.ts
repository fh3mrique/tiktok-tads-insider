
export type PesquisaResponse = {
    content: Pesquisa[];
}

export type Pesquisa = {
    id: number;
    nome: string;
    idade: number;
    linguagemFavorita: string
}
