public class Available_Captures_for_Rook_999 {
    public int numRookCaptures(char[][] board) {
        int R=board.length;
        int C=board[0].length;

        int posR,posC;
        int cnt=0;

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(board[i][j]=='R'){
                    posR=i;
                    posC=j;
                    
                    for(int up=posR;up>=0 ;up--){
                        if(board[up][posC]=='p'){
                            cnt++;
                            break;
                        }else if(board[up][posC]=='B')break;
                    }

                    
                    for(int down=posR;down<R ;down++){
                        if(board[down][posC]=='p'){
                            cnt++;
                            break;
                        }else if(board[down][posC]=='B')break;
                    }

                    
                    for(int left=posC;left>=0 ;left--){
                        if(board[posR][left]=='p'){
                            cnt++;
                            break;
                        }else if(board[posR][left]=='B')break;
                    }

                    
                    for(int right=posC;right<C ;right++){
                        if(board[posR][right]=='p'){
                            cnt++;
                            break;
                        }else if(board[posR][right]=='B')break;
                    }

                    return cnt;
                }
            }
        }
        return cnt;
    }
}