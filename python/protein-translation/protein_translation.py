def proteins(strand):
    protein = list()
    codon = [strand[i:i+3] for i in range(0, len(strand), 3)]
    proteinDict = {
        'AUG':'Methionine',
        **dict.fromkeys(['UUU','UUC'], 'Phenylalanine'),
        **dict.fromkeys(['UUA','UUG'],'Leucine'),
        **dict.fromkeys(['UCU','UCC','UCA','UCG'],'Serine'),
        **dict.fromkeys(['UAU','UAC'], 'Tyrosine'),
        **dict.fromkeys(['UGU','UGC'], 'Cysteine'),
        'UGG':'Tryptophan',
        **dict.fromkeys(['UAA','UAG','UGA'], False)
    }
    for i in codon:
        if proteinDict[i]: protein.append(proteinDict[i])
        else: break
    return protein
